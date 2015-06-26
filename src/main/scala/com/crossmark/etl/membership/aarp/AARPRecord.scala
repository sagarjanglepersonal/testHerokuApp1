package com.crossmark.etl.membership.aarp

import com.crossmark.etl.membership.PositionalField

/**
 * Object that defines the AARP record columns.
 */
object AARPRecord {
  val key = PositionalField("CHID_key", 4, 10, 20, 29)
  val fields = Seq(
    PositionalField("Keycode", 1, 12, 1, 12),
    PositionalField("Insight_Campaign_ID", 2, 5, 13, 17),
    PositionalField("Reason_Code", 3, 2, 18, 19),
    PositionalField("CHID_key", 4, 10, 20, 29),
    PositionalField("CID_key", 5, 10, 30, 39),
    PositionalField("MID_key", 6, 12, 40, 51),
    PositionalField("Prefix", 7, 8, 52, 59),
    PositionalField("First_name", 8, 25, 60, 84),
    PositionalField("MI", 9, 1, 85, 85),
    PositionalField("Last_name", 10, 16, 86, 101),
    PositionalField("Suffix", 11, 4, 102, 105),
    PositionalField("addr_1", 12, 40, 106, 145),
    PositionalField("addr_2", 13, 28, 146, 173),
    PositionalField("city", 14, 18, 174, 191),
    PositionalField("state", 15, 2, 192, 193),
    PositionalField("zip", 16, 5, 194, 198),
    PositionalField("zip4", 17, 4, 199, 202),
    PositionalField("dpbc", 18, 2, 203, 204),
    PositionalField("carrt", 19, 4, 205, 208),
    PositionalField("dma_cd", 20, 3, 209, 211),
    PositionalField("age_agg_ind", 21, 3, 212, 214),
    PositionalField("initial_gender", 22, 1, 215, 215),
    PositionalField("Birth_Dt_Agg_Ind", 23, 8, 216, 223),
    PositionalField("Employment_Stat", 24, 1, 224, 224),
    PositionalField("Marital_Stat_Agg_Ind", 25, 1, 225, 225),
    PositionalField("association_idt", 26, 1, 226, 226),
    PositionalField("mem_type_agg_act", 27, 1, 227, 227),
    PositionalField("account_stat", 28, 1, 228, 228),
    PositionalField("kx_create_dt", 29, 8, 229, 236),
    PositionalField("times_renewed_agg_act", 30, 1, 237, 237),
    PositionalField("paid_through_dt", 31, 6, 238, 243),
    PositionalField("num_curr_participation_lifestyle_agg_hhd", 32, 3, 244, 246),
    PositionalField("num_hist_participation_lifestyle_agg_hhd", 33, 3, 247, 249),
    PositionalField("corp_member_ind", 34, 1, 250, 250),
    PositionalField("filler_1", 35, 1, 251, 251),
    PositionalField("last_participation_lifestyle_dt_agg_hhd", 36, 8, 252, 259),
    PositionalField("occupancy_conf_ind", 37, 1, 260, 260),
    PositionalField("address_move_ind", 38, 1, 261, 261),
    PositionalField("term_agg_act", 39, 3, 262, 264),
    PositionalField("sec_mid_agg_act", 40, 12, 265, 276),
    PositionalField("sec_person_id", 41, 10, 277, 286),
    PositionalField("sec_title_agg_act", 42, 8, 287, 294),
    PositionalField("sec_first_name_agg_act", 43, 25, 295, 319),
    PositionalField("sec_mi_agg_act", 44, 1, 320, 320),
    PositionalField("sec_last_name_agg_act", 45, 16, 321, 336),
    PositionalField("sec_suffix_agg_act", 46, 4, 337, 340),
    PositionalField("sec_gender_agg_act", 47, 1, 341, 341),
    PositionalField("sec_birth_dt_agg_act", 48, 8, 342, 349),
    PositionalField("sec_age_agg_act", 49, 3, 350, 352),
    PositionalField("addr_move_dt", 50, 8, 353, 360),
    PositionalField("addr_change_src", 51, 2, 361, 362),
    PositionalField("Country", 52, 2, 363, 364),
    PositionalField("sp_email_eligible_fl_agg_ind", 53, 1, 365, 365),
    PositionalField("orig_participation_lifestyle_dt_agg_hhd", 54, 8, 366, 373),
    PositionalField("num_curr_participation_health_agg_hhd", 55, 3, 374, 376),
    PositionalField("num_hist_trans_participation_health_agg_hhd", 56, 3, 377, 379),
    PositionalField("filler_5", 57, 18, 380, 397),
    PositionalField("last_trans_participation_health_dt_agg_hhd", 58, 8, 398, 405),
    PositionalField("orig_trans_participation_health_dt_agg_hhd", 59, 8, 406, 413),
    PositionalField("num_hist_trans_participation_discounts_agg_hhd", 60, 3, 414, 416),
    PositionalField("last_trans_participation_discounts_dt_agg_hhd", 61, 8, 417, 424),
    PositionalField("Filler_Suppress_1", 62, 3, 425, 427),
    PositionalField("orig_participation_travel_dt_agg_hhd", 63, 8, 428, 435),
    PositionalField("last_participation_travel_dt_agg_hhd", 64, 8, 436, 443),
    PositionalField("num_hist_participation_travel_agg_hhd", 65, 8, 444, 451),
    PositionalField("num_curr_participation_travel_agg_hhd", 66, 8, 452, 459),
    PositionalField("orig_participation_health_dt_agg_hhd", 67, 8, 460, 467),
    PositionalField("last_participation_health_dt_agg_hhd", 68, 8, 468, 475),
    PositionalField("num_hist_participation_health_agg_hhd", 69, 3, 476, 478),
    PositionalField("orig_participation_financial_dt_agg_hhd", 70, 8, 479, 486),
    PositionalField("last_participation_financial_dt_agg_hhd", 71, 8, 487, 494),
    PositionalField("num_hist_participation_financial_agg_hhd", 72, 3, 495, 497),
    PositionalField("num_curr_participation_financial_agg_hhd", 73, 3, 498, 500),
    PositionalField("orig_participation_technology_dt_agg_hhd", 74, 8, 501, 508),
    PositionalField("last_participation_technology_dt_agg_hhd", 75, 8, 509, 516),
    PositionalField("num_hist_participation_technology_agg_hhd", 76, 3, 517, 519),
    PositionalField("num_curr_participation_technology_agg_hhd", 77, 3, 520, 522),
    PositionalField("orig_participation_discounts_dt_agg_hhd", 78, 8, 523, 530),
    PositionalField("last_participation_discounts_dt_agg_hhd", 79, 8, 531, 538),
    PositionalField("num_hist_participation_discounts_agg_hhd", 80, 3, 539, 541),
    PositionalField("num_curr_participation_discounts_agg_hhd", 81, 3, 542, 544),
    PositionalField("orig_participation_overall_dt_agg_hhd", 82, 8, 545, 552),
    PositionalField("last_participation_overall_dt_agg_hhd", 83, 8, 553, 560),
    PositionalField("num_hist_participation_overall_agg_hhd", 84, 3, 561, 563),
    PositionalField("num_curr_participation_overall_agg_hhd", 85, 3, 564, 566),
    PositionalField("num_contact_travel_3_months_agg_hhd", 86, 3, 567, 569),
    PositionalField("num_contact_travel_12_months_agg_hhd", 87, 3, 570, 572),
    PositionalField("num_contact_health_3_months_agg_hhd", 88, 3, 573, 575),
    PositionalField("num_contact_health_12_months_agg_hhd", 89, 3, 576, 578),
    PositionalField("num_contact_financial_3_months_agg_hhd", 90, 3, 579, 581),
    PositionalField("num_contact_financial_12_months_agg_hhd", 91, 3, 582, 584),
    PositionalField("num_contact_technology_3_months_agg_hhd", 92, 3, 585, 587),
    PositionalField("num_contact_technology_12_months_agg_hhd", 93, 3, 588, 590),
    PositionalField("num_contact_discounts_3_months_agg_hhd", 94, 3, 591, 593),
    PositionalField("num_contact_discounts_12_months_agg_hhd", 95, 3, 594, 596),
    PositionalField("num_contact_aarp_3_months_agg_hhd", 96, 3, 597, 599),
    PositionalField("num_contact_aarp_12_months_agg_hhd", 97, 3, 600, 602),
    PositionalField("num_contact_overall_3_months_agg_hhd", 98, 3, 603, 605),
    PositionalField("num_contact_overall_12_months_agg_hhd", 99, 3, 606, 608),
    PositionalField("orig_trans_participation_discounts_dt_agg_hhd", 100, 8, 609, 616),
    PositionalField("num_hist_trans_participation_technology_agg_hhd", 101, 3, 617, 619),
    PositionalField("last_trans_participation_technology_dt_agg_hhd", 102, 8, 620, 627),
    PositionalField("orig_trans_participation_technology_dt_agg_hhd", 103, 8, 628, 635),
    PositionalField("num_hist_trans_participation_financial_agg_hhd", 104, 3, 636, 638),
    PositionalField("ibx_pasdsf_deliverability_idt", 105, 1, 639, 639),
    PositionalField("ibx_inferred_household_rank", 106, 1, 640, 640),
    PositionalField("filler_6", 107, 1, 641, 641),
    PositionalField("filler_7", 108, 1, 642, 642),
    PositionalField("filler_8", 109, 1, 643, 643),
    PositionalField("ibx_current_affairs_politics_premier", 110, 1, 644, 644),
    PositionalField("ibx_community_charities_premier", 111, 1, 645, 645),
    PositionalField("ibx_religious_inspirational_premier", 112, 1, 646, 646),
    PositionalField("ibx_travel_us_premier", 113, 1, 647, 647),
    PositionalField("ibx_travel_foreign_premier", 114, 1, 648, 648),
    PositionalField("ibx_recreational_vehicles_premier", 115, 1, 649, 649),
    PositionalField("ibx_travel_family_vacations_premier", 116, 1, 650, 650),
    PositionalField("ibx_travel_cruise_vacations_premier", 117, 1, 651, 651),
    PositionalField("ibx_grandchildren_premier", 118, 1, 652, 652),
    PositionalField("ibx_pc_owner_premier", 119, 1, 653, 653),
    PositionalField("ibx_travel_grouping_premier", 120, 1, 654, 654),
    PositionalField("ibx_exercise_health_group_premier", 121, 1, 655, 655),
    PositionalField("ibx_electronics_company_grouping_premier", 122, 1, 656, 656),
    PositionalField("ibx_Investing_finance_grouping_premier", 123, 1, 657, 657),
    PositionalField("ibx_soho_idt_premier", 124, 1, 658, 658),
    PositionalField("ibx_home_year_built", 125, 1, 659, 659),
    PositionalField("acxiom_filler_2", 126, 3, 660, 662),
    PositionalField("ibx_vehicle_truck_motorcycle_rv_premier", 127, 3, 663, 665),
    PositionalField("filler_9", 128, 17, 666, 682),
    PositionalField("filler_10", 129, 5, 683, 687),
    PositionalField("ibx_mail_order_donor", 130, 1, 688, 688),
    PositionalField("Filler_11", 131, 1, 689, 689),
    PositionalField("Filler_12", 132, 1, 690, 690),
    PositionalField("ibx_golf", 133, 1, 691, 691),
    PositionalField("ibx_pets_other", 134, 1, 692, 692),
    PositionalField("filler_13", 135, 1, 693, 693),
    PositionalField("ibx_outdoors_dimension", 136, 1, 694, 694),
    PositionalField("filler_14", 137, 1, 695, 695),
    PositionalField("ibx_mail_order_buyer", 138, 1, 696, 696),
    PositionalField("ibx_movie_music_grouping", 139, 1, 697, 697),
    PositionalField("ibx_home_improvement_grouping", 140, 1, 698, 698),
    PositionalField("Filler_15", 141, 1, 699, 699),
    PositionalField("ibx_investors_highly_likely", 142, 1, 700, 700),
    PositionalField("ibx_investors_likely", 143, 1, 701, 701),
    PositionalField("ibx_home_loan_dt_1", 144, 6, 702, 707),
    PositionalField("ibx_home_loan_total_ranges", 145, 1, 708, 708),
    PositionalField("ibx_home_lot_square_footage_ranges", 146, 1, 709, 709),
    PositionalField("ibx_home_lot_built_ranges", 147, 1, 710, 710),
    PositionalField("ibx_home_square_footage_ranges", 148, 1, 711, 711),
    PositionalField("ibx_home_room_count", 149, 3, 712, 714),
    PositionalField("ibx_home_roof_type", 150, 2, 715, 716),
    PositionalField("ibx_home_market_value_deciles", 151, 2, 717, 718),
    PositionalField("ibx_political_party_1st_individual", 152, 1, 719, 719),
    PositionalField("ibx_political_party_2nd_individual", 153, 1, 720, 720),
    PositionalField("ibx_political_party_input_individual", 154, 1, 721, 721),
    PositionalField("ibx_owner_type_detail", 155, 1, 722, 722),
    PositionalField("ibx_home_assessed_value_ranges", 156, 1, 723, 723),
    PositionalField("ibx_home_purchased_amount_ranges", 157, 1, 724, 724),
    PositionalField("ibx_home_lender_name_1", 158, 30, 725, 754),
    PositionalField("ibx_home_loan_amount_1_ranges", 159, 1, 755, 755),
    PositionalField("ibx_home_loan_type_1", 160, 1, 756, 756),
    PositionalField("ibx_home_loan_interest_rate_type_1", 161, 1, 757, 757),
    PositionalField("ibx_home_loan_transaction_type_1", 162, 1, 758, 758),
    PositionalField("ibx_home_owner", 163, 1, 759, 759),
    PositionalField("ibx_home_purchase_dt_year_month", 164, 6, 760, 765),
    PositionalField("ibx_home_purchase_year", 165, 4, 766, 769),
    PositionalField("ibx_home_property_type_details", 166, 1, 770, 770),
    PositionalField("ibx_home_loan_to_value_ranges", 167, 1, 771, 771),
    PositionalField("ibx_home_equity_available_ranges", 168, 1, 772, 772),
    PositionalField("ibx_home_equity_lendable_ranges", 169, 1, 773, 773),
    PositionalField("ibx_home_owners_insurance_expiration_dt", 170, 4, 774, 777),
    PositionalField("ibx_home_year_built_actual", 171, 4, 778, 781),
    PositionalField("ibx_adult_age_ranges_present_in_household_premier", 172, 21, 782, 802),
    PositionalField("ibx_children_age_ranges_present_in_household_premier", 173, 15, 803, 817),
    PositionalField("ibx_children_household_in_household_premier", 174, 1, 818, 818),
    PositionalField("ibx_occupation_1st_individual_premier", 175, 1, 819, 819),
    PositionalField("ibx_occupation_2nd_individual_premier", 176, 1, 820, 820),
    PositionalField("ibx_home_owner_renter_premier", 177, 1, 821, 821),
    PositionalField("ibx_length_of_residence_premier", 178, 2, 822, 823),
    PositionalField("ibx_dwelling_type", 179, 1, 824, 824),
    PositionalField("ibx_marital_stat_in_the_household_premier", 180, 1, 825, 825),
    PositionalField("ibx_nm_gender_1st_individual_premier", 181, 12, 826, 837),
    PositionalField("ibx_nm_gender_2nd_individual_premier", 182, 12, 838, 849),
    PositionalField("ibx_base_record_verification_dt", 183, 5, 850, 854),
    PositionalField("Filler_16", 184, 1, 855, 855),
    PositionalField("ibx_age_in_two_year_increments_1st_individual_premier", 185, 2, 856, 857),
    PositionalField("ibx_age_in_two_year_increments_2nd_individual_premier", 186, 2, 858, 859),
    PositionalField("ibx_working_woman_premier", 187, 1, 860, 860),
    PositionalField("ibx_mail_order_responder_premier", 188, 1, 861, 861),
    PositionalField("ibx_credit_card_idt_premier", 189, 6, 862, 867),
    PositionalField("ibx_children_presence_of_household", 190, 1, 868, 868),
    PositionalField("ibx_property_type_premier", 191, 1, 869, 869),
    PositionalField("filler_17", 192, 2, 870, 871),
    PositionalField("ibx_adults_number_of_household_premier", 193, 1, 872, 872),
    PositionalField("ibx_household_size_premier", 194, 1, 873, 873),
    PositionalField("ibx_occupation_input_individual_premier", 195, 1, 874, 874),
    PositionalField("ibx_positive_match_idt", 196, 1, 875, 875),
    PositionalField("ibx_num_of_sources_premier", 197, 2, 876, 877),
    PositionalField("ibx_home_market_value_premier", 198, 1, 878, 878),
    PositionalField("ibx_home_purchase_dt_premier", 199, 6, 879, 884),
    PositionalField("ibx_home_purchase_dt_year_premier", 200, 4, 885, 888),
    PositionalField("ibx_home_purchase_dt_month_premier", 201, 2, 889, 890),
    PositionalField("ibx_vehicle_new_car_buyer_premier", 202, 1, 891, 891),
    PositionalField("ibx_vehicle_known_owned_number_premier", 203, 1, 892, 892),
    PositionalField("ibx_vehicle_dominant_lifestyle_premier", 204, 1, 893, 893),
    PositionalField("ibx_life_stages_cd", 205, 3, 894, 896),
    PositionalField("Filler_18", 206, 1, 897, 897),
    PositionalField("ibx_apartment_num_premier", 207, 8, 898, 905),
    PositionalField("ibx_home_equity_available_premier", 208, 1, 906, 906),
    PositionalField("ibx_pc_software_buyer_premier", 209, 1, 907, 907),
    PositionalField("ibx_income_estimated_narrow_ranges_premier", 210, 1, 908, 908),
    PositionalField("ibx_presence_of_young_adult_premier", 211, 1, 909, 909),
    PositionalField("ibx_gender_input_individual_premier", 212, 1, 910, 910),
    PositionalField("ibx_presence_of_senior_adult_premier", 213, 1, 911, 911),
    PositionalField("Filler_19", 214, 12, 912, 923),
    PositionalField("ibx_home_property_type", 215, 1, 924, 924),
    PositionalField("ibx_home_loan_amount_actual", 216, 9, 925, 933),
    PositionalField("ibx_home_equity_lendable_actual", 217, 9, 934, 942),
    PositionalField("ibx_home_equity_available_actual", 218, 9, 943, 951),
    PositionalField("ibx_home_loan_amount_1_actual", 219, 9, 952, 960),
    PositionalField("ibx_trends_for_telecom_internet_user", 220, 2, 961, 962),
    PositionalField("ibx_trends_for_telecom_cellular_user", 221, 2, 963, 964),
    PositionalField("ibx_trends_for_telecom_international_long_distance_user", 222, 2, 965, 966),
    PositionalField("ibx_trends_for_telecom_optional_calling_services", 223, 2, 967, 968),
    PositionalField("ibx_trends_for_telecom_top_20percent_long_distance_user", 224, 2, 969, 970),
    PositionalField("ibx_num_of_lines_of_credit", 225, 1, 971, 971),
    PositionalField("ibx_home_lender_type_1", 226, 1, 972, 972),
    PositionalField("ibx_ethnic_code_e_tech_2", 227, 2, 973, 974),
    PositionalField("ibx_religious_affiliation_code_e_tech_2", 228, 1, 975, 975),
    PositionalField("ibx_ethnic_roll_up_code_e_tech_2", 229, 1, 976, 976),
    PositionalField("ibx_language_preference_code_e_tech_2", 230, 2, 977, 978),
    PositionalField("ibx_overall_match_idt", 231, 1, 979, 979),
    PositionalField("ibx_credit_card_frequency_of_purchase_premier", 232, 7, 980, 986),
    PositionalField("ibx_retail_activity_last_dt", 233, 8, 987, 994),
    PositionalField("ibx_retail_purchases_cat", 234, 21, 995, 1015),
    PositionalField("ibx_retail_purchases_most_frequent_cat", 235, 2, 1016, 1017),
    PositionalField("ibx_retail_purchases_activity_dt_and_cat_1", 236, 10, 1018, 1027),
    PositionalField("ibx_retail_purchases_activity_dt_and_cat_2", 237, 10, 1028, 1037),
    PositionalField("ibx_retail_purchases_activity_dt_and_cat_3", 238, 10, 1038, 1047),
    PositionalField("ibx_retail_purchases_activity_dt_and_cat_4", 239, 10, 1048, 1057),
    PositionalField("ibx_retail_purchases_activity_dt_and_cat_5", 240, 10, 1058, 1067),
    PositionalField("ibx_personic_cluster", 241, 2, 1068, 1069),
    PositionalField("ibx_personic_cluster_precision", 242, 1, 1070, 1070),
    PositionalField("ibx_networth_premier", 243, 1, 1071, 1071),
    PositionalField("IBX_VETERAN", 244, 1, 1072, 1072),
    PositionalField("filler_27", 245, 1, 1073, 1073),
    PositionalField("ibx_education_1st_individual", 246, 1, 1074, 1074),
    PositionalField("ibx_education_second_individual_premier", 247, 1, 1075, 1075),
    PositionalField("ibx_education_input_individual_premier", 248, 1, 1076, 1076),
    PositionalField("ibx_race_cd_1st_individual_premier", 249, 1, 1077, 1077),
    PositionalField("ibx_race_cd_2nd_individual_premier", 250, 1, 1078, 1078),
    PositionalField("ibx_race_cd_input_individual_premier", 251, 1, 1079, 1079),
    PositionalField("ibx_mail_order_buyer_categories", 252, 31, 1080, 1110),
    PositionalField("ibx_community_involvement_causes_supported_financially", 253, 13, 1111, 1123),
    PositionalField("ibx_age_input_individual_default_1st_individual_premier", 254, 3, 1124, 1126),
    PositionalField("last_trans_participation_financial_dt_agg_hhd", 255, 8, 1127, 1134),
    PositionalField("orig_trans_participation_financial_dt_agg_hhd", 256, 8, 1135, 1142),
    PositionalField("last_trans_participation_travel_dt_agg_hhd", 257, 8, 1143, 1150),
    PositionalField("orig_trans_participation_travel_dt_agg_hhd", 258, 8, 1151, 1158),
    PositionalField("num_hist_trans_participation_lifestyle_agg_hhd", 259, 3, 1159, 1161),
    PositionalField("last_trans_participation_lifestyle_dt_agg_hhd", 260, 8, 1162, 1169),
    PositionalField("orig_trans_participation_lifestyle_dt_agg_hhd", 261, 8, 1170, 1177),
    PositionalField("Filler_Infobase_1", 262, 2, 1178, 1179),
    PositionalField("ibx_dollars_health", 263, 6, 1180, 1185),
    PositionalField("ibx_health_beauty", 264, 1, 1186, 1186),
    PositionalField("ibx_ethnicity_group_cd", 265, 1, 1187, 1187),
    PositionalField("ibx_health_allergy", 266, 1, 1188, 1188),
    PositionalField("ibx_health_cholesterol", 267, 1, 1189, 1189),
    PositionalField("ibx_health_diabetic", 268, 1, 1190, 1190),
    PositionalField("ibx_health_homeopathic", 269, 1, 1191, 1191),
    PositionalField("ibx_health_organic", 270, 1, 1192, 1192),
    PositionalField("ibx_health_orthopedic", 271, 1, 1193, 1193),
    PositionalField("ibx_business_owner", 272, 1, 1194, 1194),
    PositionalField("ibx_travel_airline", 273, 1, 1195, 1195),
    PositionalField("ibx_online_dollars", 274, 6, 1196, 1201),
    PositionalField("ibx_adult_age_ranges_present_in_household_plus", 275, 21, 1202, 1222),
    PositionalField("ibx_occupation_detail", 276, 4, 1223, 1226),
    PositionalField("ibx_vacation_travel_us", 277, 2, 1227, 1228),
    PositionalField("ibx_vacation_travel_international", 278, 2, 1229, 1230),
    PositionalField("ibx_online_orders", 279, 3, 1231, 1233),
    PositionalField("ibx_weeks_since_last_online_order", 280, 3, 1234, 1236),
    PositionalField("ibx_online_average_amt_per_order", 281, 6, 1237, 1242),
    PositionalField("ibx_vacation_travel_cruise", 282, 2, 1243, 1244),
    PositionalField("ibx_text_messaging", 283, 1, 1245, 1245),
    PositionalField("ibx_green_living", 284, 1, 1246, 1246),
    PositionalField("ibx_business_owner_input_individual", 285, 1, 1247, 1247),
    PositionalField("ibx_cycling", 286, 1, 1248, 1248),
    PositionalField("ibx_donation_contribution", 287, 1, 1249, 1249),
    PositionalField("ibx_dvd_video", 288, 1, 1250, 1250),
    PositionalField("ibx_health_diet", 289, 1, 1251, 1251),
    PositionalField("ibx_health_medical_supplies", 290, 1, 1252, 1252),
    PositionalField("ibx_health_medical_supplies_orthopedic", 291, 1, 1253, 1253),
    PositionalField("ibx_health_nutraceuticals_vitamins", 292, 1, 1254, 1254),
    PositionalField("ibx_health_vitamins_nutrition", 293, 1, 1255, 1255),
    PositionalField("ibx_membership_clubs", 294, 1, 1256, 1256),
    PositionalField("ibx_pets", 295, 1, 1257, 1257),
    PositionalField("ibx_total_online_dollars", 296, 6, 1258, 1263),
    PositionalField("ibx_total_online_purchases", 297, 3, 1264, 1266),
    PositionalField("ibx_household_income", 298, 1, 1267, 1267),
    PositionalField("ibx_pc_broadband_user", 299, 1, 1268, 1268),
    PositionalField("ibx_credit_card_user", 300, 1, 1269, 1269),
    PositionalField("renewal_dt_agg_act", 301, 10, 1270, 1279),
    PositionalField("ibx_move_dt", 302, 6, 1280, 1285),
    PositionalField("bogus_name_fl", 303, 1, 1286, 1286),
    PositionalField("vulgar_name_fl", 304, 1, 1287, 1287),
    PositionalField("Filler_Geo_26", 305, 1, 1288, 1288),
    PositionalField("Filler_Geo_27", 306, 3, 1289, 1291),
    PositionalField("Filler_Geo_28", 307, 3, 1292, 1294),
    PositionalField("Filler_Geo_29", 308, 3, 1295, 1297),
    PositionalField("Filler_Geo_30", 309, 3, 1298, 1300),
    PositionalField("Filler_Geo_31", 310, 3, 1301, 1303),
    PositionalField("Filler_Geo_32", 311, 3, 1304, 1306),
    PositionalField("Filler_Geo_33", 312, 3, 1307, 1309),
    PositionalField("Filler_Geo_34", 313, 3, 1310, 1312),
    PositionalField("Filler_Geo_35", 314, 3, 1313, 1315),
    PositionalField("Filler_Geo_36", 315, 3, 1316, 1318),
    PositionalField("Filler_Geo_37", 316, 10, 1319, 1328),
    PositionalField("Filler_Geo_38", 317, 3, 1329, 1331),
    PositionalField("Filler_Geo_39", 318, 5, 1332, 1336),
    PositionalField("Filler_Geo_40", 319, 5, 1337, 1341),
    PositionalField("Filler_Geo_41", 320, 3, 1342, 1344),
    PositionalField("Filler_Geo_42", 321, 3, 1345, 1347),
    PositionalField("Filler_Geo_43", 322, 3, 1348, 1350),
    PositionalField("Filler_Geo_44", 323, 3, 1351, 1353),
    PositionalField("Filler_Geo_45", 324, 3, 1354, 1356),
    PositionalField("Filler_Geo_46", 325, 3, 1357, 1359),
    PositionalField("Filler_Geo_47", 326, 3, 1360, 1362),
    PositionalField("Filler_Geo_48", 327, 3, 1363, 1365),
    PositionalField("Filler_Geo_49", 328, 3, 1366, 1368),
    PositionalField("Filler_Geo_50", 329, 3, 1369, 1371),
    PositionalField("Filler_Geo_51", 330, 3, 1372, 1374),
    PositionalField("Filler_Geo_52", 331, 3, 1375, 1377),
    PositionalField("num_hist_trans_participation_travel_agg_hhd", 332, 3, 1378, 1380),
    PositionalField("Filler_Infobase_2", 333, 27, 1381, 1407),
    PositionalField("ibx_ethnic_code_e_tech", 334, 2, 1408, 1409),
    PositionalField("ibx_religious_affiliation_code_e_tech", 335, 1, 1410, 1410),
    PositionalField("ibx_language_preference_code_e_tech", 336, 2, 1411, 1412),
    PositionalField("ibx_country_of_origin_code_e_tech", 337, 2, 1413, 1414),
    PositionalField("ibx_ethnic_roll_up_code_e_tech", 338, 1, 1415, 1415),
    PositionalField("Filler_20", 339, 1, 1416, 1416),
    PositionalField("Filler_Infobase_3", 340, 6, 1417, 1422),
    PositionalField("RESPONSE_CHANNEL", 341, 1, 1423, 1423),
    PositionalField("NUM_TIMES_CONTACTED_PRIOR_TO_RENEWAL", 342, 1, 1424, 1424),
    PositionalField("REGISTER_IND", 343, 1, 1425, 1425),
    PositionalField("NUM_EMAILS_OPENED_3_MONTHS_AGG_IND", 344, 3, 1426, 1428),
    PositionalField("NUM_TIMES_CLICKED_THR_EMAIL_3_MONTHS_AGG_IND", 345, 3, 1429, 1431),
    PositionalField("OPTIN_CAT_PREF_01", 346, 2, 1432, 1433),
    PositionalField("OPTIN_CAT_PREF_02", 347, 2, 1434, 1435),
    PositionalField("OPTIN_CAT_PREF_03", 348, 2, 1436, 1437),
    PositionalField("OPTIN_CAT_PREF_04", 349, 2, 1438, 1439),
    PositionalField("OPTIN_CAT_PREF_05", 350, 2, 1440, 1441),
    PositionalField("OPTIN_CAT_PREF_06", 351, 2, 1442, 1443),
    PositionalField("OPTIN_CAT_PREF_07", 352, 2, 1444, 1445),
    PositionalField("Lifestage_Segment", 353, 1, 1446, 1446),
    PositionalField("NMAS_1_HLTH_DCL", 354, 2, 1447, 1448),
    PositionalField("NMAS_2_HLTH_SEC", 355, 2, 1449, 1450),
    PositionalField("NMAS_3_REN_HLTH", 356, 2, 1451, 1452),
    PositionalField("NMAS_4_PARENT", 357, 2, 1453, 1454),
    PositionalField("NMAS_5_LIFE_INS", 358, 2, 1455, 1456),
    PositionalField("NMAS_6_FIN_SEC", 359, 2, 1457, 1458),
    PositionalField("NMAS_7_CONSUME", 360, 2, 1459, 1460),
    PositionalField("NMAS_8_EMPLOY", 361, 2, 1461, 1462),
    PositionalField("NMAS_9_INVEST", 362, 2, 1463, 1464),
    PositionalField("NMAS_10_CREDIT", 363, 2, 1465, 1466),
    PositionalField("NMAS_11_RETIRE", 364, 2, 1467, 1468),
    PositionalField("NMAS_12_HME_INS", 365, 2, 1469, 1470),
    PositionalField("NMAS_13_CAR_INS", 366, 2, 1471, 1472),
    PositionalField("NMAS_14_COM_INV", 367, 2, 1473, 1474),
    PositionalField("NMAS_15_LIV_COM", 368, 2, 1475, 1476),
    PositionalField("NMAS_16_LOCAL", 369, 2, 1477, 1478),
    PositionalField("NMAS_17_CHARITY", 370, 2, 1479, 1480),
    PositionalField("NMAS_18_ADVOCY", 371, 2, 1481, 1482),
    PositionalField("NMAS_19_VOLUNT", 372, 2, 1483, 1484),
    PositionalField("NMAS_20_TRAVEL", 373, 2, 1485, 1486),
    PositionalField("NMAS_21_LEISURE", 374, 2, 1487, 1488),
    PositionalField("NMAS_22_CHILDRN", 375, 2, 1489, 1490),
    PositionalField("NMAS_23_MOTORNG", 376, 2, 1491, 1492),
    PositionalField("NMAS_24_PROGSVC", 377, 2, 1493, 1494),
    PositionalField("NMAS_25_ATTITDE", 378, 2, 1495, 1496),
    PositionalField("NMAS_26_WEBUSE", 379, 2, 1497, 1498),
    PositionalField("NMAS_27_PUBS", 380, 2, 1499, 1500),
    PositionalField("NMAS_28_MEDIA", 381, 2, 1501, 1502),
    PositionalField("Filler_21", 382, 2, 1503, 1504),
    PositionalField("Filler_22", 383, 2, 1505, 1506),
    PositionalField("Filler_23", 384, 2, 1507, 1508),
    PositionalField("RELATIONSHIP_SEG", 385, 2, 1509, 1510),
    PositionalField("RPM_SCORE", 386, 2, 1511, 1512),
    PositionalField("NMAS_29_LIFE", 387, 2, 1513, 1514),
    PositionalField("NMAS_30_ONLINE", 388, 2, 1515, 1516),
    PositionalField("NMAS_31_DRVS", 389, 2, 1517, 1518),
    PositionalField("NMAS_32_JOB_SEC", 390, 2, 1519, 1520),
    PositionalField("NMAS_33_MEDICAR", 391, 2, 1521, 1522),
    PositionalField("NMAS_34_BIZNES", 392, 2, 1523, 1524),
    PositionalField("NMAS_35_RENEWAL", 393, 2, 1525, 1526),
    PositionalField("NMAS_36_UTILITY", 394, 2, 1527, 1528),
    PositionalField("NMAS_37_REN_OT", 395, 2, 1529, 1530),
    PositionalField("NMAS_38_DEALS", 396, 2, 1531, 1532),
    PositionalField("NMAS_39_SS", 397, 2, 1533, 1534),
    PositionalField("NMAS_40_LTC", 398, 2, 1535, 1536),
    PositionalField("Filler_model_1", 399, 4, 1537, 1540))
}