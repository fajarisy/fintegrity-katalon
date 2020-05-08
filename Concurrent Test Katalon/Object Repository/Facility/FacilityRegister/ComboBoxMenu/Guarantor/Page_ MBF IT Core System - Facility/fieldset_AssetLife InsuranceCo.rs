<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>fieldset_AssetLife InsuranceCo</name>
   <tag></tag>
   <elementGuidId>fd3561bf-88fd-4200-86e9-e4351ab5c404</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>fieldset</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
						Asset
	Life Insurance
	Commission
	Financing Scheme
	Guarantor
	Collateral Object
	Fee
	Signer and Payer
	Additional Information
	History
	Document Upload

 &lt;-- Asset, Commission, Fee, Additional Information and Financing Schema should be filled
					Facility - Add GuarantorGuarantor IDGuarantor NameAddressRelationship with LesseeAction//&lt;![CDATA[
new Richfaces.Datascroller('frmMain:dtAddGuarantor:j_id1285', function(event){A4J.AJAX.Submit('frmMain',event,{'ignoreDupResponses':true,'implicitEventsQueue':'frmMain:dtAddGuarantor:j_id1285','oncomplete':function(request,event,data){javascript:hideProgress();setPage(1)},'similarityGroupingId':'frmMain:dtAddGuarantor:j_id1285','parameters':{'ajaxSingle':'frmMain:dtAddGuarantor:j_id1285','frmMain:dtAddGuarantor:j_id1285':event.memo.page} } ); return false;});
//]]>
 //&lt;![CDATA[

            function openForm(idFacility) {
                var target = rootPath + 'Facility/Guarantor/form.xhtml';
                target += '?idTask=' + '24911446' + '&amp;idFacility=' + '';

                    showPopWin(target, 700, 450, null);
            }

            function remove(idRegister, idFacility) {
                var hdnFidFacilityNoTmp = document.getElementById(&quot;frmMain:hdnFidFacilityNoTmp&quot;);
                hdnFidFacilityNoTmp.value = idFacility;
                var hdnFidRegister = document.getElementById(&quot;frmMain:hdnFidRegister&quot;);
                hdnFidRegister.value = idRegister;

                var btnRemove = document.getElementById(&quot;frmMain:btnRemove&quot;);
                btnRemove.click();
            }
        //]]>
  
            /* &lt;![CDATA[ */

            function closePop(refresher) {

                if (refresher != null) {
                    var btnRefresh = document.getElementById(refresher);
                    
                    if (btnRefresh != null) btnRefresh.click();
                }
                
                hidePopWin(false);
            }

            /* ]]> */
            
        
				</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;frmMain:pnlSelectMenu&quot;)/fieldset[1]</value>
   </webElementProperties>
</WebElementEntity>
