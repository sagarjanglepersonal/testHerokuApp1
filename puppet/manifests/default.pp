$sys_packages    = [ 'build-essential', 'curl', 'vim']

Exec { path => [ "/bin/", "/sbin/", "/usr/bin", "/usr/sbin/" ] }

class { 'apt': 
  always_apt_update => true,
}

package { $sys_packages: 
  ensure => present,
  require => Class["apt"],
}

class {'::mongodb::server':
  port    => 27018,
  verbose => true,
}

include '::rabbitmq'

user { 'test':
  ensure => 'present',
  password => generate('/bin/sh', '-c', "mkpasswd -m sha-512 test | tr -d '\n'"),
  managehome => true,
}