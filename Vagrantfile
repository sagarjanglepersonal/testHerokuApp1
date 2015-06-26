VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.box = "ubuntu-server-12042-x64-vbox4210"
  config.vm.box_url = "http://puppet-vagrant-boxes.puppetlabs.com/ubuntu-server-12042-x64-vbox4210.box"

  config.vm.network "forwarded_port", guest: 27018, host: 27018

  config.vm.provision :shell do |shell|
    shell.inline = "mkdir -p /etc/puppet/modules;
                  puppet module install puppetlabs-apt;
                  puppet module install nanliu-staging;
                  puppet module install puppetlabs-rabbitmq;
                  puppet module install puppetlabs-mongodb"
  end

  config.vm.provision "shell", path: "vagrant/configure-users.sh"

  config.vm.provision :puppet do |puppet|
    puppet.manifests_path = "puppet/manifests"
  end

  config.push.define "ftp" do |push|
      push.host = "localhost:2222"
      push.username = "ingest"
      push.password = "ingest"
      secure = true
      destination = "/home/ingest/"
      dir = "deploy"
  end
end
