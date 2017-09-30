#text_file = open("D:\\nodesO.sql", "w")
#text_file.write("set def off\nset feedback off\nset serveroutput on\n")
#x=10000
#while x<=50000:
#    text_file.write("INSERT INTO dns_name (dns_name_id,version,forward_name,forward_unicode_name,reversed_name,site_id,parent_id,last_upd_usr,last_upd_dt) VALUES("+str(x)+",0,'node"+str(x)+"','node"+str(x)+"','node"+str(x)+"',1,NULL,1,to_date('2016-01-07','yyyy-mm-dd'));\nINSERT INTO node (node_id,version,node_type,org_id,dns_name_id,unique_id,description,duid,mac_addr,last_upd_usr,last_upd_dt) VALUES("+str(x)+",0,1,1,"+str(x)+",'"+str(x)+"',NULL,NULL,NULL,1,to_date('2016-01-07', 'yyyy-mm-dd'));\n")
#    x=x+1
#    if x%9==0 :
#        text_file.write("COMMIT;\n")
#text_file.write("COMMIT;\nexit")
#text_file.close()

#text_file = open("D:\\subnetDomain.sql", "w")
#x=6195
#while x<=18482:
#    text_file.write("insert into subnet_domns (seq_num, last_upd_usr, last_upd_dt, domn_id, subnet_id) values (1, 1, getdate(), 1, "+str(x)+")\nGO\n")
#    x=x+1
#text_file.close()

#text_file = open("D:\\createScope.sql", "w")
#x=6195
#y=2055
#z=0
#t=0
#net=4
#while x<=18482:
#    text_file.write("INSERT INTO obj_prof (obj_id,obj_ip_addr1,obj_ip_addr2,obj_ip_addr3,obj_ip_addr4,org_id,domn_id,subnet_id,alloc_type_cd,dual_prof_cd,obj_class_cd,appl_id,mac_id,model_type,serial_num,asset_no,host_id,flag,server_type,bootfile_name,purchase_dt,obj_desc,exp_dt,contact_id,auth_name,bootp_flag,loc_id,room_id,object_tag,ns_usage,ns_update_flags,lease_time,bootp_id,temp_id,p_temp_id,default_name,min_time,a_ttl,ptr_ttl,eduptimestamp,edupcomment,tombstoned,dhcpmod_dynobj_rrs,last_upd_usr,last_upd_dt,node_id) VALUES("+str(y)+","+str(net)+","+str(z)+","+str(t*64)+",1,1,1,"+str(x)+",3,0,3,0,0,NULL,NULL,NULL,NULL,0,0,NULL,NULL,NULL,NULL,0,NULL,5,0,NULL,NULL,1,15,7776000,1,1,0,'pcp0000"+str(y)+"pcs',-1,-1,-1,NULL,NULL,0,0,1,'2016-03-21 14:14:19.143',0)\nGO\n")
#    x=x+1
#    y=y+1
#    t=t+1
#    if t>3:
#        t=0
#        z=z+1
#        if z==256:
#            z=0
#            net=net+1
#text_file.close()

#For adding rrs Zone
#Sybase
#text_file = open("D:\\createRRSZone.sql", "w")
#id = 100
#zoneid= 1
#while id<=1000:
#    text_file.write("INSERT INTO rrs (rr_id,rr_owner,rrowner_unicode_name,search_rrowner,zone_id,rr_class,rr_type,min_time,last_upd_usr,last_upd_dt,rr_text,rrtext_unicode_name,search_rrtext,forward_zone,publishing) VALUES("+str(id)+",'abc"+str(id)+"','abc"+str(id)+"','ABC"+str(id)+"',0,'IN','A',-1,1,'2016-04-04 09:17:32.226','1.1.1.2','1.1.1.2','1.1.1.2',1,0)\n")
#    text_file.write("INSERT INTO rrs_uda (rr_uda_id,version,rr_id,uda_definition_id,uda_group_id,uda_valuechoice_id,uda_value_parent_id,uda_value_parent_name,uda_order,uda_name,uda_value,last_upd_usr,last_upd_dt) VALUES("+str(id)+",0,"+str(id)+",1,NULL,NULL,0,NULL,1,'Att1','false',1,'2016-04-04 09:17:32.226')\n")
#    text_file.write("INSERT INTO zone_rrs (zone_id,rr_id,zone_source,cr_ptr,edup_created,eduptimestamp,edupcomment,tombstoned,last_upd_usr,last_upd_dt) VALUES("+str(zoneid)+","+str(id)+",6,0,0,NULL,NULL,0,1,'2016-04-04 09:09:38.753')\nGO\n")
#    id=id+1
#text_file.close()

#Oracle
text_file = open("D:\\createRRSZoneO.sql", "w")
id = 100
zoneid= 1
while id<=1000:
    text_file.write("INSERT INTO rrs (rr_id,rr_owner,rrowner_unicode_name,search_rrowner,zone_id,rr_class,rr_type,min_time,last_upd_usr,last_upd_dt,rr_text,rrtext_unicode_name,search_rrtext,forward_zone,publishing) VALUES("+str(id)+",'abc"+str(id)+"','abc"+str(id)+"','ABC"+str(id)+"',0,'IN','A',-1,1,TO_DATE('2016-04-04','yyyy-mm-dd'),'1.1.1.2','1.1.1.2','1.1.1.2',1,0);\n")
    text_file.write("INSERT INTO rrs_uda (rr_uda_id,version,rr_id,uda_definition_id,uda_group_id,uda_valuechoice_id,uda_value_parent_id,uda_value_parent_name,uda_order,uda_name,uda_value,last_upd_usr,last_upd_dt) VALUES("+str(id)+",0,"+str(id)+",1,NULL,NULL,0,NULL,1,'Att1','false',1,TO_DATE('2016-04-04','yyyy-mm-dd'));\n")
    text_file.write("INSERT INTO zone_rrs (zone_id,rr_id,zone_source,cr_ptr,edup_created,eduptimestamp,edupcomment,tombstoned,last_upd_usr,last_upd_dt) VALUES("+str(zoneid)+","+str(id)+",6,0,0,NULL,NULL,0,1,TO_DATE('2016-04-04','yyyy-mm-dd'));\n")
    id=id+1
text_file.write("COMMIT;")
text_file.close()
