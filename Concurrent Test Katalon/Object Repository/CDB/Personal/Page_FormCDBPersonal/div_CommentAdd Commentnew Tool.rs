<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_CommentAdd Commentnew Tool</name>
   <tag></tag>
   <elementGuidId>1292b6f2-263e-4d81-bff5-d931d245af51</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>frmMain:contentWrapper</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>contentWrapper</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
		
			Comment
				Add Comment
new ToolTip(&quot;frmMain:j_id58&quot;,&quot;frmMain:btnAddComment&quot;,{'showEvent':'mouseover','horizontalOffset':30,'direction':'top\x2Dleft','followMouse':true} );

		
		 
	
    
        
    
        

            /* &lt;![CDATA[ */

            function closePop(refresher) {

                if (refresher != null) {
                    var btnRefresh = document.getElementById(refresher);
                    
                    if (btnRefresh != null) btnRefresh.click();
                }
                
                hidePopWin(false);
            }

            /* ]]> */
            
        
		

            function addComment() {
                var target = rootPath + 'Task/Comment/form.xhtml?appModule=CifPers&amp;idModule=EB-P20180705005&amp;idTask=24910328';

                showPopWin(target, 500, 320, null);
            }

        
				
					
						Warning
					Document Upload Status Is Not Completed Yet.
						




				
				
					

						Basic Information



Type

	

 Customer

 BPKB Name
	




CDB No.
EB-P20180705005



Suffix
	MR.
	MRS.
	MS.




Gender
	Male
	Female




Name
 *




Place of Birth




Date of Birth
 *
.frmMain_cldBirthDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456Richfaces.Calendar.addLocale('en_US', {'weekDayLabels':['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'] ,'weekDayLabelsShort':['Sun','Mon','Tue','Wed','Thu','Fri','Sat'] ,'monthLabels':['January','February','March','April','May','June','July','August','September','October','November','December'] ,'monthLabelsShort':['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'] ,'minDaysInFirstWeek':1,'firstWeekDay':0} );
new Calendar('frmMain:cldBirthDate', 
			&quot;en_US&quot;,{'selectedDate':new Date(2017,6,11,0,0,0),'currentDate':new Date(2017,6,11),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_cldBirthDateDayCell','enableManualInput':true} ,{} ).load();



Marital Status
	-
	DIVORCED
	MARRIED
	SINGLE
	WIDOWED




Nationality
	ANDORRA
	BELGIUM
	CENTRAL AFRICAN REPUBLIC
	INDONESIA
	IRELAND
	JAPAN
	MALAYSIA
	NO CATEGORY
	OTHERS
	SOUTH KOREA






					
					

						ID Information



ID Type
	DRIVER LICENSE
	ID CARD
	PASSPORT




ID Card No.
 *

Lifetime


ID Expired Date *
/*&lt;![CDATA[*/
.frmMain_expiredDateDayCell{width:24px;height:22px;}
/*]]>*/
SunMonTueWedThuFriSat
123456//&lt;![CDATA[
Richfaces.Calendar.addLocale('en_US', {'weekDayLabels':['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'] ,'weekDayLabelsShort':['Sun','Mon','Tue','Wed','Thu','Fri','Sat'] ,'monthLabels':['January','February','March','April','May','June','July','August','September','October','November','December'] ,'monthLabelsShort':['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'] ,'minDaysInFirstWeek':1,'firstWeekDay':0} );
new Calendar('frmMain:expiredDate', 
                        &quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'dayCellClass':'frmMain_expiredDateDayCell','direction':'top\x2Dright','disabled':true} ,{} ).load();
//]]>




Reminder ID Exp.
.frmMain_idExpiredDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:idExpiredDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_idExpiredDateDayCell','direction':'top\x2Dright','jointPoint':'bottom\x2Dright','disabled':true} ,{} ).load();



KIMS/KITAS




KIMS/KITAS Expired Date
 *
.frmMain_kimsExpiredDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:kimsExpiredDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'dayCellClass':'frmMain_kimsExpiredDateDayCell','direction':'top\x2Dright','disabled':true} ,{} ).load();



Reminder KIMS/KITAS Exp.
 *
.frmMain_remindKimsExpiredDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:remindKimsExpiredDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'dayCellClass':'frmMain_remindKimsExpiredDateDayCell','direction':'top\x2Dright','disabled':true} ,{} ).load();



NPWP No.

								





					
					

						Other Information



Business Relationship Since




Last Education
	COLLEGE
	JUNIOR HIGH SCHOOL
	NEVER GO INTO SCHOOL
	PRIMARY SCHOOL
	SENIOR HIGH SCHOOL
	UNIVERSITY




Mother Maiden Name




Number Dependent




Relation With Our Staff




Legal Review Date
.frmMain_idLegalReviewDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:idLegalReviewDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','selectedDate':new Date(2018,6,5,0,0,0),'currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_idLegalReviewDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load();



Reminder Review Date
.frmMain_idReminderReviewDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:idReminderReviewDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','selectedDate':new Date(2018,6,6,0,0,0),'currentDate':new Date(2018,6,6),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_idReminderReviewDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load();



Credit Rating From BI

 As Of .frmMain_idCreditRatingAsOfDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:idCreditRatingAsOfDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','selectedDate':new Date(2018,6,4,0,0,0),'currentDate':new Date(2018,6,4),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_idCreditRatingAsOfDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load();



Other Conditions
Test Other Conditions





					
						

							Facility Line
								Information



Headquarter Approval No

: 




Headquarter Approval Date

: 
SunMonTueWedThuFriSat
123456new Calendar('frmMain:j_id314', 
			&quot;en_US&quot;,{'currentDate':new Date(2018,6,5)} ,{} ).load();



Currency

: 
	IDR
	JPY
	USD




Facility Line Amount

: 




Available Amount

: 




Used Amount

: 






						
						

							Group Information
Search(Search By Group Name)
                




Group No
:

Group Name
:






						
							
									Address
	Bank Statement
	Guarantor
	Occupation
	Other Document
	Payer
	Registration Info
	Survey And Interview

 &lt;-- for Customer, Address, Bank Statement, Occupation, Payer, Survey and Interview should be filled (You Must Save Register Form First to Enable!)
								
        

    List of AddressTypeAddressCityPostal CodeAction
        Add New
new ToolTip(&quot;frmMain:j_id415&quot;,&quot;frmMain:btnAdd_EB-P20180705005&quot;,{'showEvent':'mouseover','horizontalOffset':20,'direction':'top\x2Dright','followMouse':true} );

        
    

        function openFormAddress(idfCustomer) {
            var target = rootPath + 'CIF/Personal/Address/form.xhtml';
            if (idfCustomer!= &quot;&quot;)
                target += '?idfCustomer=' + idfCustomer;

                 showPopWin(target, 800, 500, null);
        }

        function openEditFormAddress(idAddressTmp) {
            var target = rootPath + 'CIF/Personal/Address/form.xhtml';
                target += '?idAddressTmp=' + idAddressTmp ;

            showPopWin(target, 800, 500, null);
        }

        function openViewFormAddress(idAddress) {
            var target = rootPath + 'CIF/Personal/Address/form.xhtml';
                target += '?idAddress=' + idAddress;

            showPopWin(target, 800, 500, null);
        }

        function remove(idToRemove) {
            var hdnRemove = document.getElementById(&quot;frmMain:hdnRemove&quot;);
            hdnRemove.value = idToRemove;

            var btnRemove = document.getElementById(&quot;frmMain:btnRemove&quot;);
            btnRemove.click();
        }

     
	
    
        
    
        

            /* &lt;![CDATA[ */

            function closePop(refresher) {

                if (refresher != null) {
                    var btnRefresh = document.getElementById(refresher);
                    
                    if (btnRefresh != null) btnRefresh.click();
                }
                
                hidePopWin(false);
            }

            /* ]]> */
            
        
 							
					
Consistency of Address in KTP+KK+PBB
 *
	

 Yes

 No
	

					
					
						

							Document UploadDescriptionIs CheckedChecking DateUpload Doc.Action«««12»»»new Richfaces.Datascroller('frmMain:tblDocChecking:j_id456', function(event){A4J.AJAX.Submit('frmMain',event,{'ignoreDupResponses':true,'implicitEventsQueue':'frmMain:tblDocChecking:j_id456','similarityGroupingId':'frmMain:tblDocChecking:j_id456','parameters':{'ajaxSingle':'frmMain:tblDocChecking:j_id456','frmMain:tblDocChecking:j_id456':event.memo.page} } ); return false;});FOTOCOPY AKTE NIKAH/CERAI/KEMATIAN.frmMain_tblDocChecking_0_idcheckingDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:tblDocChecking:0:idcheckingDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_tblDocChecking_0_idcheckingDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load(); new ProgressBar('frmMain:tblDocChecking:0:upload_rich_progress',{'markup':null,'minValue':-1,'value':0,'state':'progressState','options':{'pollId':'frmMain:tblDocChecking:0:upload_rich_progress','similarityGroupingId':'frmMain:tblDocChecking:0:upload_rich_progress','parameters':{'percent':'percent','ajaxSingle':'frmMain:tblDocChecking:0:upload_rich_progress','frmMain:tblDocChecking:0:upload_rich_progress':'frmMain:tblDocChecking:0:upload_rich_progress'} ,'pollinterval':1000} } )
;
$('frmMain:tblDocChecking:0:upload_rich_progress').component.renderLabel(null,null);

A4J.AJAX.StopPoll('frmMain:tblDocChecking:0:upload_rich_progress');
;
Select FileUploadClear Allnew FileUpload('frmMain:tblDocChecking:0:upload','/Fintegrity/CIF/Personal/Register/form.xhtml', function(uid,action,callback,event){A4J.AJAX.Submit('frmMain',event,{'similarityGroupingId':'frmMain:tblDocChecking:0:upload','parameters':{'ajaxSingle':'frmMain:tblDocChecking:0:upload','frmMain:tblDocChecking:0:upload':'frmMain:tblDocChecking:0:upload','_richfaces_upload_uid':uid,'_richfaces_file_upload_action':action} ,'onbeforedomupdate':callback} )}, 'frmMain:tblDocChecking:0:upload_rich_progress',
					'bmzAhg2uqMh4aMePPW5HxURL',{'classes':{'UPDATE':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} ,'STOP':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} } ,'labels':{'progress':'uploading','stop':'Stop','done':'Done','entry_cancel':'Cancel','entry_clear':'Clear','clear_all':'Clear All','transfer_error':'Transfer error occurred','size_error':'File size restricted','add':'Select File','entry_stop':'Stop','upload':'Upload'} ,'fields':{'events':{'onerror':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onerror')},'similarityGroupingId':'frmMain:tblDocChecking:0:j_id445','parameters':{'frmMain:tblDocChecking:0:j_id445':'frmMain:tblDocChecking:0:j_id445'} ,'eventsQueue':'mainCifQueue'} )},'onuploadcomplete':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onuploadcomplete')},'similarityGroupingId':'frmMain:tblDocChecking:0:j_id446','parameters':{'frmMain:tblDocChecking:0:j_id446':'frmMain:tblDocChecking:0:j_id446'} ,'eventsQueue':'mainCifQueue'} )}} ,'acceptedTypes':{'bmp':true,'jpg':true,'xls':true,'xlsx':true,'png':true,'pdf':true,'doc':true,'docx':true} ,'options':{'flashComponentUrl':'/Fintegrity/a4j/g/3_3_3.Finalorg/richfaces/renderkit/html/swf/FileUploadComponent.swf.xhtml','autoclear':true} } } );Remove
new ToolTip(&quot;frmMain:tblDocChecking:0:j_id455&quot;,&quot;btnRemove&quot;,{'showEvent':'mouseover','horizontalOffset':20,'direction':'top\x2Dright','followMouse':true} );
FOTOCOPY BUKTI USAHA (SIUP/TDP).frmMain_tblDocChecking_1_idcheckingDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:tblDocChecking:1:idcheckingDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_tblDocChecking_1_idcheckingDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load(); new ProgressBar('frmMain:tblDocChecking:1:upload_rich_progress',{'markup':null,'minValue':-1,'value':0,'state':'progressState','options':{'pollId':'frmMain:tblDocChecking:1:upload_rich_progress','similarityGroupingId':'frmMain:tblDocChecking:1:upload_rich_progress','parameters':{'percent':'percent','ajaxSingle':'frmMain:tblDocChecking:1:upload_rich_progress','frmMain:tblDocChecking:1:upload_rich_progress':'frmMain:tblDocChecking:1:upload_rich_progress'} ,'pollinterval':1000} } )
;
$('frmMain:tblDocChecking:1:upload_rich_progress').component.renderLabel(null,null);

A4J.AJAX.StopPoll('frmMain:tblDocChecking:1:upload_rich_progress');
;
Select FileUploadClear Allnew FileUpload('frmMain:tblDocChecking:1:upload','/Fintegrity/CIF/Personal/Register/form.xhtml', function(uid,action,callback,event){A4J.AJAX.Submit('frmMain',event,{'similarityGroupingId':'frmMain:tblDocChecking:1:upload','parameters':{'ajaxSingle':'frmMain:tblDocChecking:1:upload','frmMain:tblDocChecking:1:upload':'frmMain:tblDocChecking:1:upload','_richfaces_upload_uid':uid,'_richfaces_file_upload_action':action} ,'onbeforedomupdate':callback} )}, 'frmMain:tblDocChecking:1:upload_rich_progress',
					'bmzAhg2uqMh4aMePPW5HxURL',{'classes':{'UPDATE':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} ,'STOP':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} } ,'labels':{'progress':'uploading','stop':'Stop','done':'Done','entry_cancel':'Cancel','entry_clear':'Clear','clear_all':'Clear All','transfer_error':'Transfer error occurred','size_error':'File size restricted','add':'Select File','entry_stop':'Stop','upload':'Upload'} ,'fields':{'events':{'onerror':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onerror')},'similarityGroupingId':'frmMain:tblDocChecking:1:j_id445','parameters':{'frmMain:tblDocChecking:1:j_id445':'frmMain:tblDocChecking:1:j_id445'} ,'eventsQueue':'mainCifQueue'} )},'onuploadcomplete':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onuploadcomplete')},'similarityGroupingId':'frmMain:tblDocChecking:1:j_id446','parameters':{'frmMain:tblDocChecking:1:j_id446':'frmMain:tblDocChecking:1:j_id446'} ,'eventsQueue':'mainCifQueue'} )}} ,'acceptedTypes':{'bmp':true,'jpg':true,'xls':true,'xlsx':true,'png':true,'pdf':true,'doc':true,'docx':true} ,'options':{'flashComponentUrl':'/Fintegrity/a4j/g/3_3_3.Finalorg/richfaces/renderkit/html/swf/FileUploadComponent.swf.xhtml','autoclear':true} } } );Remove
new ToolTip(&quot;frmMain:tblDocChecking:1:j_id455&quot;,&quot;btnRemove&quot;,{'showEvent':'mouseover','horizontalOffset':20,'direction':'top\x2Dright','followMouse':true} );
FOTOCOPY KARTU KELUARGA.frmMain_tblDocChecking_2_idcheckingDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:tblDocChecking:2:idcheckingDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_tblDocChecking_2_idcheckingDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load(); new ProgressBar('frmMain:tblDocChecking:2:upload_rich_progress',{'markup':null,'minValue':-1,'value':0,'state':'progressState','options':{'pollId':'frmMain:tblDocChecking:2:upload_rich_progress','similarityGroupingId':'frmMain:tblDocChecking:2:upload_rich_progress','parameters':{'percent':'percent','ajaxSingle':'frmMain:tblDocChecking:2:upload_rich_progress','frmMain:tblDocChecking:2:upload_rich_progress':'frmMain:tblDocChecking:2:upload_rich_progress'} ,'pollinterval':1000} } )
;
$('frmMain:tblDocChecking:2:upload_rich_progress').component.renderLabel(null,null);

A4J.AJAX.StopPoll('frmMain:tblDocChecking:2:upload_rich_progress');
;
Select FileUploadClear Allnew FileUpload('frmMain:tblDocChecking:2:upload','/Fintegrity/CIF/Personal/Register/form.xhtml', function(uid,action,callback,event){A4J.AJAX.Submit('frmMain',event,{'similarityGroupingId':'frmMain:tblDocChecking:2:upload','parameters':{'ajaxSingle':'frmMain:tblDocChecking:2:upload','frmMain:tblDocChecking:2:upload':'frmMain:tblDocChecking:2:upload','_richfaces_upload_uid':uid,'_richfaces_file_upload_action':action} ,'onbeforedomupdate':callback} )}, 'frmMain:tblDocChecking:2:upload_rich_progress',
					'bmzAhg2uqMh4aMePPW5HxURL',{'classes':{'UPDATE':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} ,'STOP':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} } ,'labels':{'progress':'uploading','stop':'Stop','done':'Done','entry_cancel':'Cancel','entry_clear':'Clear','clear_all':'Clear All','transfer_error':'Transfer error occurred','size_error':'File size restricted','add':'Select File','entry_stop':'Stop','upload':'Upload'} ,'fields':{'events':{'onerror':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onerror')},'similarityGroupingId':'frmMain:tblDocChecking:2:j_id445','parameters':{'frmMain:tblDocChecking:2:j_id445':'frmMain:tblDocChecking:2:j_id445'} ,'eventsQueue':'mainCifQueue'} )},'onuploadcomplete':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onuploadcomplete')},'similarityGroupingId':'frmMain:tblDocChecking:2:j_id446','parameters':{'frmMain:tblDocChecking:2:j_id446':'frmMain:tblDocChecking:2:j_id446'} ,'eventsQueue':'mainCifQueue'} )}} ,'acceptedTypes':{'bmp':true,'jpg':true,'xls':true,'xlsx':true,'png':true,'pdf':true,'doc':true,'docx':true} ,'options':{'flashComponentUrl':'/Fintegrity/a4j/g/3_3_3.Finalorg/richfaces/renderkit/html/swf/FileUploadComponent.swf.xhtml','autoclear':true} } } );Remove
new ToolTip(&quot;frmMain:tblDocChecking:2:j_id455&quot;,&quot;btnRemove&quot;,{'showEvent':'mouseover','horizontalOffset':20,'direction':'top\x2Dright','followMouse':true} );
FOTOCOPY KTP PEMOHON.frmMain_tblDocChecking_3_idcheckingDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:tblDocChecking:3:idcheckingDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_tblDocChecking_3_idcheckingDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load(); new ProgressBar('frmMain:tblDocChecking:3:upload_rich_progress',{'markup':null,'minValue':-1,'value':0,'state':'progressState','options':{'pollId':'frmMain:tblDocChecking:3:upload_rich_progress','similarityGroupingId':'frmMain:tblDocChecking:3:upload_rich_progress','parameters':{'percent':'percent','ajaxSingle':'frmMain:tblDocChecking:3:upload_rich_progress','frmMain:tblDocChecking:3:upload_rich_progress':'frmMain:tblDocChecking:3:upload_rich_progress'} ,'pollinterval':1000} } )
;
$('frmMain:tblDocChecking:3:upload_rich_progress').component.renderLabel(null,null);

A4J.AJAX.StopPoll('frmMain:tblDocChecking:3:upload_rich_progress');
;
Select FileUploadClear Allnew FileUpload('frmMain:tblDocChecking:3:upload','/Fintegrity/CIF/Personal/Register/form.xhtml', function(uid,action,callback,event){A4J.AJAX.Submit('frmMain',event,{'similarityGroupingId':'frmMain:tblDocChecking:3:upload','parameters':{'ajaxSingle':'frmMain:tblDocChecking:3:upload','_richfaces_upload_uid':uid,'_richfaces_file_upload_action':action,'frmMain:tblDocChecking:3:upload':'frmMain:tblDocChecking:3:upload'} ,'onbeforedomupdate':callback} )}, 'frmMain:tblDocChecking:3:upload_rich_progress',
					'bmzAhg2uqMh4aMePPW5HxURL',{'classes':{'UPDATE':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} ,'STOP':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} } ,'labels':{'progress':'uploading','stop':'Stop','done':'Done','entry_cancel':'Cancel','entry_clear':'Clear','clear_all':'Clear All','transfer_error':'Transfer error occurred','size_error':'File size restricted','add':'Select File','entry_stop':'Stop','upload':'Upload'} ,'fields':{'events':{'onerror':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onerror')},'similarityGroupingId':'frmMain:tblDocChecking:3:j_id445','parameters':{'frmMain:tblDocChecking:3:j_id445':'frmMain:tblDocChecking:3:j_id445'} ,'eventsQueue':'mainCifQueue'} )},'onuploadcomplete':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onuploadcomplete')},'similarityGroupingId':'frmMain:tblDocChecking:3:j_id446','parameters':{'frmMain:tblDocChecking:3:j_id446':'frmMain:tblDocChecking:3:j_id446'} ,'eventsQueue':'mainCifQueue'} )}} ,'acceptedTypes':{'bmp':true,'jpg':true,'xls':true,'xlsx':true,'png':true,'pdf':true,'doc':true,'docx':true} ,'options':{'flashComponentUrl':'/Fintegrity/a4j/g/3_3_3.Finalorg/richfaces/renderkit/html/swf/FileUploadComponent.swf.xhtml','autoclear':true} } } );Remove
new ToolTip(&quot;frmMain:tblDocChecking:3:j_id455&quot;,&quot;btnRemove&quot;,{'showEvent':'mouseover','horizontalOffset':20,'direction':'top\x2Dright','followMouse':true} );
FOTOCOPY KTP PENJAMIN &amp; REKENING.frmMain_tblDocChecking_4_idcheckingDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:tblDocChecking:4:idcheckingDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_tblDocChecking_4_idcheckingDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load(); new ProgressBar('frmMain:tblDocChecking:4:upload_rich_progress',{'markup':null,'minValue':-1,'value':0,'state':'progressState','options':{'pollId':'frmMain:tblDocChecking:4:upload_rich_progress','similarityGroupingId':'frmMain:tblDocChecking:4:upload_rich_progress','parameters':{'percent':'percent','ajaxSingle':'frmMain:tblDocChecking:4:upload_rich_progress','frmMain:tblDocChecking:4:upload_rich_progress':'frmMain:tblDocChecking:4:upload_rich_progress'} ,'pollinterval':1000} } )
;
$('frmMain:tblDocChecking:4:upload_rich_progress').component.renderLabel(null,null);

A4J.AJAX.StopPoll('frmMain:tblDocChecking:4:upload_rich_progress');
;
Select FileUploadClear Allnew FileUpload('frmMain:tblDocChecking:4:upload','/Fintegrity/CIF/Personal/Register/form.xhtml', function(uid,action,callback,event){A4J.AJAX.Submit('frmMain',event,{'similarityGroupingId':'frmMain:tblDocChecking:4:upload','parameters':{'frmMain:tblDocChecking:4:upload':'frmMain:tblDocChecking:4:upload','ajaxSingle':'frmMain:tblDocChecking:4:upload','_richfaces_upload_uid':uid,'_richfaces_file_upload_action':action} ,'onbeforedomupdate':callback} )}, 'frmMain:tblDocChecking:4:upload_rich_progress',
					'bmzAhg2uqMh4aMePPW5HxURL',{'classes':{'UPDATE':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} ,'STOP':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} } ,'labels':{'progress':'uploading','stop':'Stop','done':'Done','entry_cancel':'Cancel','entry_clear':'Clear','clear_all':'Clear All','transfer_error':'Transfer error occurred','size_error':'File size restricted','add':'Select File','entry_stop':'Stop','upload':'Upload'} ,'fields':{'events':{'onerror':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onerror')},'similarityGroupingId':'frmMain:tblDocChecking:4:j_id445','parameters':{'frmMain:tblDocChecking:4:j_id445':'frmMain:tblDocChecking:4:j_id445'} ,'eventsQueue':'mainCifQueue'} )},'onuploadcomplete':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onuploadcomplete')},'similarityGroupingId':'frmMain:tblDocChecking:4:j_id446','parameters':{'frmMain:tblDocChecking:4:j_id446':'frmMain:tblDocChecking:4:j_id446'} ,'eventsQueue':'mainCifQueue'} )}} ,'acceptedTypes':{'bmp':true,'jpg':true,'xls':true,'xlsx':true,'png':true,'pdf':true,'doc':true,'docx':true} ,'options':{'flashComponentUrl':'/Fintegrity/a4j/g/3_3_3.Finalorg/richfaces/renderkit/html/swf/FileUploadComponent.swf.xhtml','autoclear':true} } } );Remove
new ToolTip(&quot;frmMain:tblDocChecking:4:j_id455&quot;,&quot;btnRemove&quot;,{'showEvent':'mouseover','horizontalOffset':20,'direction':'top\x2Dright','followMouse':true} );
FOTOCOPY KTP SUAMI/ISTRI.frmMain_tblDocChecking_5_idcheckingDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:tblDocChecking:5:idcheckingDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_tblDocChecking_5_idcheckingDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load(); new ProgressBar('frmMain:tblDocChecking:5:upload_rich_progress',{'markup':null,'minValue':-1,'value':0,'state':'progressState','options':{'pollId':'frmMain:tblDocChecking:5:upload_rich_progress','similarityGroupingId':'frmMain:tblDocChecking:5:upload_rich_progress','parameters':{'percent':'percent','ajaxSingle':'frmMain:tblDocChecking:5:upload_rich_progress','frmMain:tblDocChecking:5:upload_rich_progress':'frmMain:tblDocChecking:5:upload_rich_progress'} ,'pollinterval':1000} } )
;
$('frmMain:tblDocChecking:5:upload_rich_progress').component.renderLabel(null,null);

A4J.AJAX.StopPoll('frmMain:tblDocChecking:5:upload_rich_progress');
;
Select FileUploadClear Allnew FileUpload('frmMain:tblDocChecking:5:upload','/Fintegrity/CIF/Personal/Register/form.xhtml', function(uid,action,callback,event){A4J.AJAX.Submit('frmMain',event,{'similarityGroupingId':'frmMain:tblDocChecking:5:upload','parameters':{'frmMain:tblDocChecking:5:upload':'frmMain:tblDocChecking:5:upload','ajaxSingle':'frmMain:tblDocChecking:5:upload','_richfaces_upload_uid':uid,'_richfaces_file_upload_action':action} ,'onbeforedomupdate':callback} )}, 'frmMain:tblDocChecking:5:upload_rich_progress',
					'bmzAhg2uqMh4aMePPW5HxURL',{'classes':{'UPDATE':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} ,'STOP':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} } ,'labels':{'progress':'uploading','stop':'Stop','done':'Done','entry_cancel':'Cancel','entry_clear':'Clear','clear_all':'Clear All','transfer_error':'Transfer error occurred','size_error':'File size restricted','add':'Select File','entry_stop':'Stop','upload':'Upload'} ,'fields':{'events':{'onerror':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onerror')},'similarityGroupingId':'frmMain:tblDocChecking:5:j_id445','parameters':{'frmMain:tblDocChecking:5:j_id445':'frmMain:tblDocChecking:5:j_id445'} ,'eventsQueue':'mainCifQueue'} )},'onuploadcomplete':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onuploadcomplete')},'similarityGroupingId':'frmMain:tblDocChecking:5:j_id446','parameters':{'frmMain:tblDocChecking:5:j_id446':'frmMain:tblDocChecking:5:j_id446'} ,'eventsQueue':'mainCifQueue'} )}} ,'acceptedTypes':{'bmp':true,'jpg':true,'xls':true,'xlsx':true,'png':true,'pdf':true,'doc':true,'docx':true} ,'options':{'flashComponentUrl':'/Fintegrity/a4j/g/3_3_3.Finalorg/richfaces/renderkit/html/swf/FileUploadComponent.swf.xhtml','autoclear':true} } } );Remove
new ToolTip(&quot;frmMain:tblDocChecking:5:j_id455&quot;,&quot;btnRemove&quot;,{'showEvent':'mouseover','horizontalOffset':20,'direction':'top\x2Dright','followMouse':true} );
FOTOCOPY PBB/AJB/SERTIFIKAT/PLN/TELKOM.frmMain_tblDocChecking_6_idcheckingDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:tblDocChecking:6:idcheckingDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_tblDocChecking_6_idcheckingDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load(); new ProgressBar('frmMain:tblDocChecking:6:upload_rich_progress',{'markup':null,'minValue':-1,'value':0,'state':'progressState','options':{'pollId':'frmMain:tblDocChecking:6:upload_rich_progress','similarityGroupingId':'frmMain:tblDocChecking:6:upload_rich_progress','parameters':{'percent':'percent','ajaxSingle':'frmMain:tblDocChecking:6:upload_rich_progress','frmMain:tblDocChecking:6:upload_rich_progress':'frmMain:tblDocChecking:6:upload_rich_progress'} ,'pollinterval':1000} } )
;
$('frmMain:tblDocChecking:6:upload_rich_progress').component.renderLabel(null,null);

A4J.AJAX.StopPoll('frmMain:tblDocChecking:6:upload_rich_progress');
;
Select FileUploadClear Allnew FileUpload('frmMain:tblDocChecking:6:upload','/Fintegrity/CIF/Personal/Register/form.xhtml', function(uid,action,callback,event){A4J.AJAX.Submit('frmMain',event,{'similarityGroupingId':'frmMain:tblDocChecking:6:upload','parameters':{'frmMain:tblDocChecking:6:upload':'frmMain:tblDocChecking:6:upload','ajaxSingle':'frmMain:tblDocChecking:6:upload','_richfaces_upload_uid':uid,'_richfaces_file_upload_action':action} ,'onbeforedomupdate':callback} )}, 'frmMain:tblDocChecking:6:upload_rich_progress',
					'bmzAhg2uqMh4aMePPW5HxURL',{'classes':{'UPDATE':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} ,'STOP':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} } ,'labels':{'progress':'uploading','stop':'Stop','done':'Done','entry_cancel':'Cancel','entry_clear':'Clear','clear_all':'Clear All','transfer_error':'Transfer error occurred','size_error':'File size restricted','add':'Select File','entry_stop':'Stop','upload':'Upload'} ,'fields':{'events':{'onerror':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onerror')},'similarityGroupingId':'frmMain:tblDocChecking:6:j_id445','parameters':{'frmMain:tblDocChecking:6:j_id445':'frmMain:tblDocChecking:6:j_id445'} ,'eventsQueue':'mainCifQueue'} )},'onuploadcomplete':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onuploadcomplete')},'similarityGroupingId':'frmMain:tblDocChecking:6:j_id446','parameters':{'frmMain:tblDocChecking:6:j_id446':'frmMain:tblDocChecking:6:j_id446'} ,'eventsQueue':'mainCifQueue'} )}} ,'acceptedTypes':{'bmp':true,'jpg':true,'xls':true,'xlsx':true,'png':true,'pdf':true,'doc':true,'docx':true} ,'options':{'flashComponentUrl':'/Fintegrity/a4j/g/3_3_3.Finalorg/richfaces/renderkit/html/swf/FileUploadComponent.swf.xhtml','autoclear':true} } } );Remove
new ToolTip(&quot;frmMain:tblDocChecking:6:j_id455&quot;,&quot;btnRemove&quot;,{'showEvent':'mouseover','horizontalOffset':20,'direction':'top\x2Dright','followMouse':true} );
FOTOCOPY REK. KORAN 3 BLN TERAKHIR.frmMain_tblDocChecking_7_idcheckingDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:tblDocChecking:7:idcheckingDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_tblDocChecking_7_idcheckingDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load(); new ProgressBar('frmMain:tblDocChecking:7:upload_rich_progress',{'markup':null,'minValue':-1,'value':0,'state':'progressState','options':{'pollId':'frmMain:tblDocChecking:7:upload_rich_progress','similarityGroupingId':'frmMain:tblDocChecking:7:upload_rich_progress','parameters':{'percent':'percent','ajaxSingle':'frmMain:tblDocChecking:7:upload_rich_progress','frmMain:tblDocChecking:7:upload_rich_progress':'frmMain:tblDocChecking:7:upload_rich_progress'} ,'pollinterval':1000} } )
;
$('frmMain:tblDocChecking:7:upload_rich_progress').component.renderLabel(null,null);

A4J.AJAX.StopPoll('frmMain:tblDocChecking:7:upload_rich_progress');
;
Select FileUploadClear Allnew FileUpload('frmMain:tblDocChecking:7:upload','/Fintegrity/CIF/Personal/Register/form.xhtml', function(uid,action,callback,event){A4J.AJAX.Submit('frmMain',event,{'similarityGroupingId':'frmMain:tblDocChecking:7:upload','parameters':{'ajaxSingle':'frmMain:tblDocChecking:7:upload','_richfaces_upload_uid':uid,'frmMain:tblDocChecking:7:upload':'frmMain:tblDocChecking:7:upload','_richfaces_file_upload_action':action} ,'onbeforedomupdate':callback} )}, 'frmMain:tblDocChecking:7:upload_rich_progress',
					'bmzAhg2uqMh4aMePPW5HxURL',{'classes':{'UPDATE':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} ,'STOP':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} } ,'labels':{'progress':'uploading','stop':'Stop','done':'Done','entry_cancel':'Cancel','entry_clear':'Clear','clear_all':'Clear All','transfer_error':'Transfer error occurred','size_error':'File size restricted','add':'Select File','entry_stop':'Stop','upload':'Upload'} ,'fields':{'events':{'onerror':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onerror')},'similarityGroupingId':'frmMain:tblDocChecking:7:j_id445','parameters':{'frmMain:tblDocChecking:7:j_id445':'frmMain:tblDocChecking:7:j_id445'} ,'eventsQueue':'mainCifQueue'} )},'onuploadcomplete':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onuploadcomplete')},'similarityGroupingId':'frmMain:tblDocChecking:7:j_id446','parameters':{'frmMain:tblDocChecking:7:j_id446':'frmMain:tblDocChecking:7:j_id446'} ,'eventsQueue':'mainCifQueue'} )}} ,'acceptedTypes':{'bmp':true,'jpg':true,'xls':true,'xlsx':true,'png':true,'pdf':true,'doc':true,'docx':true} ,'options':{'flashComponentUrl':'/Fintegrity/a4j/g/3_3_3.Finalorg/richfaces/renderkit/html/swf/FileUploadComponent.swf.xhtml','autoclear':true} } } );Remove
new ToolTip(&quot;frmMain:tblDocChecking:7:j_id455&quot;,&quot;btnRemove&quot;,{'showEvent':'mouseover','horizontalOffset':20,'direction':'top\x2Dright','followMouse':true} );
OTHER 1.frmMain_tblDocChecking_8_idcheckingDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:tblDocChecking:8:idcheckingDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_tblDocChecking_8_idcheckingDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load(); new ProgressBar('frmMain:tblDocChecking:8:upload_rich_progress',{'markup':null,'minValue':-1,'value':0,'state':'progressState','options':{'pollId':'frmMain:tblDocChecking:8:upload_rich_progress','similarityGroupingId':'frmMain:tblDocChecking:8:upload_rich_progress','parameters':{'percent':'percent','ajaxSingle':'frmMain:tblDocChecking:8:upload_rich_progress','frmMain:tblDocChecking:8:upload_rich_progress':'frmMain:tblDocChecking:8:upload_rich_progress'} ,'pollinterval':1000} } )
;
$('frmMain:tblDocChecking:8:upload_rich_progress').component.renderLabel(null,null);

A4J.AJAX.StopPoll('frmMain:tblDocChecking:8:upload_rich_progress');
;
Select FileUploadClear Allnew FileUpload('frmMain:tblDocChecking:8:upload','/Fintegrity/CIF/Personal/Register/form.xhtml', function(uid,action,callback,event){A4J.AJAX.Submit('frmMain',event,{'similarityGroupingId':'frmMain:tblDocChecking:8:upload','parameters':{'frmMain:tblDocChecking:8:upload':'frmMain:tblDocChecking:8:upload','ajaxSingle':'frmMain:tblDocChecking:8:upload','_richfaces_upload_uid':uid,'_richfaces_file_upload_action':action} ,'onbeforedomupdate':callback} )}, 'frmMain:tblDocChecking:8:upload_rich_progress',
					'bmzAhg2uqMh4aMePPW5HxURL',{'classes':{'UPDATE':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} ,'STOP':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} } ,'labels':{'progress':'uploading','stop':'Stop','done':'Done','entry_cancel':'Cancel','entry_clear':'Clear','clear_all':'Clear All','transfer_error':'Transfer error occurred','size_error':'File size restricted','add':'Select File','entry_stop':'Stop','upload':'Upload'} ,'fields':{'events':{'onerror':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onerror')},'similarityGroupingId':'frmMain:tblDocChecking:8:j_id445','parameters':{'frmMain:tblDocChecking:8:j_id445':'frmMain:tblDocChecking:8:j_id445'} ,'eventsQueue':'mainCifQueue'} )},'onuploadcomplete':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onuploadcomplete')},'similarityGroupingId':'frmMain:tblDocChecking:8:j_id446','parameters':{'frmMain:tblDocChecking:8:j_id446':'frmMain:tblDocChecking:8:j_id446'} ,'eventsQueue':'mainCifQueue'} )}} ,'acceptedTypes':{'bmp':true,'jpg':true,'xls':true,'xlsx':true,'png':true,'pdf':true,'doc':true,'docx':true} ,'options':{'flashComponentUrl':'/Fintegrity/a4j/g/3_3_3.Finalorg/richfaces/renderkit/html/swf/FileUploadComponent.swf.xhtml','autoclear':true} } } );Remove
new ToolTip(&quot;frmMain:tblDocChecking:8:j_id455&quot;,&quot;btnRemove&quot;,{'showEvent':'mouseover','horizontalOffset':20,'direction':'top\x2Dright','followMouse':true} );
SURAT KETERANGAN PENGHASILAN/SLIP GAJI.frmMain_tblDocChecking_9_idcheckingDateDayCell{width:24px;height:22px;}SunMonTueWedThuFriSat
123456new Calendar('frmMain:tblDocChecking:9:idcheckingDate', 
			&quot;en_US&quot;,{'style':'z\x2Dindex: 3; width:200px','currentDate':new Date(2018,6,5),'datePattern':'dd/MM/yyyy','dayCellClass':'frmMain_tblDocChecking_9_idcheckingDateDayCell','direction':'top\x2Dright','enableManualInput':true,'jointPoint':'bottom\x2Dright'} ,{} ).load(); new ProgressBar('frmMain:tblDocChecking:9:upload_rich_progress',{'markup':null,'minValue':-1,'value':0,'state':'progressState','options':{'pollId':'frmMain:tblDocChecking:9:upload_rich_progress','similarityGroupingId':'frmMain:tblDocChecking:9:upload_rich_progress','parameters':{'percent':'percent','ajaxSingle':'frmMain:tblDocChecking:9:upload_rich_progress','frmMain:tblDocChecking:9:upload_rich_progress':'frmMain:tblDocChecking:9:upload_rich_progress'} ,'pollinterval':1000} } )
;
$('frmMain:tblDocChecking:9:upload_rich_progress').component.renderLabel(null,null);

A4J.AJAX.StopPoll('frmMain:tblDocChecking:9:upload_rich_progress');
;
Select FileUploadClear Allnew FileUpload('frmMain:tblDocChecking:9:upload','/Fintegrity/CIF/Personal/Register/form.xhtml', function(uid,action,callback,event){A4J.AJAX.Submit('frmMain',event,{'similarityGroupingId':'frmMain:tblDocChecking:9:upload','parameters':{'ajaxSingle':'frmMain:tblDocChecking:9:upload','_richfaces_upload_uid':uid,'_richfaces_file_upload_action':action,'frmMain:tblDocChecking:9:upload':'frmMain:tblDocChecking:9:upload'} ,'onbeforedomupdate':callback} )}, 'frmMain:tblDocChecking:9:upload_rich_progress',
					'bmzAhg2uqMh4aMePPW5HxURL',{'classes':{'UPDATE':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} ,'STOP':{'ENABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel','DISABLED':'rich\x2Dfileupload\x2Dbold\x2Dlabel'} } ,'labels':{'progress':'uploading','stop':'Stop','done':'Done','entry_cancel':'Cancel','entry_clear':'Clear','clear_all':'Clear All','transfer_error':'Transfer error occurred','size_error':'File size restricted','add':'Select File','entry_stop':'Stop','upload':'Upload'} ,'fields':{'events':{'onerror':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onerror')},'similarityGroupingId':'frmMain:tblDocChecking:9:j_id445','parameters':{'frmMain:tblDocChecking:9:j_id445':'frmMain:tblDocChecking:9:j_id445'} ,'eventsQueue':'mainCifQueue'} )},'onuploadcomplete':function(event){A4J.AJAX.Submit('frmMain',event,{'oncomplete':function(request,event,data){console.log('onuploadcomplete')},'similarityGroupingId':'frmMain:tblDocChecking:9:j_id446','parameters':{'frmMain:tblDocChecking:9:j_id446':'frmMain:tblDocChecking:9:j_id446'} ,'eventsQueue':'mainCifQueue'} )}} ,'acceptedTypes':{'bmp':true,'jpg':true,'xls':true,'xlsx':true,'png':true,'pdf':true,'doc':true,'docx':true} ,'options':{'flashComponentUrl':'/Fintegrity/a4j/g/3_3_3.Finalorg/richfaces/renderkit/html/swf/FileUploadComponent.swf.xhtml','autoclear':true} } } );Remove
new ToolTip(&quot;frmMain:tblDocChecking:9:j_id455&quot;,&quot;btnRemove&quot;,{'showEvent':'mouseover','horizontalOffset':20,'direction':'top\x2Dright','followMouse':true} );


						
function dpf(f) {var adp = f.adp;if (adp != null) {for (var i = 0;i &lt; adp.length;i++) {f.removeChild(adp[i]);}}};function apf(f, pvp) {var adp = new Array();f.adp = adp;var i = 0;for (k in pvp) {var p = document.createElement(&quot;input&quot;);p.type = &quot;hidden&quot;;p.name = k;p.value = pvp[k];f.appendChild(p);adp[i++] = p;}};function jsfcljs(f, pvp, t) {apf(f, pvp);var ft = f.target;if (t) {f.target = t;}f.submit();f.target = ft;dpf(f);};
Add New
new ToolTip(&quot;frmMain:j_id462&quot;,&quot;frmMain:btnCommandLink_default&quot;,{'showEvent':'mouseover','horizontalOffset':30,'direction':'top\x2Dleft','followMouse':true} );

					</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;frmMain:contentWrapper&quot;)</value>
   </webElementProperties>
</WebElementEntity>
