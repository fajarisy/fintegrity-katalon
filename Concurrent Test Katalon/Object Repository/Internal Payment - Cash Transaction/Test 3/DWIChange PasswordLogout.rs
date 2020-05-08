<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>DWIChange PasswordLogout</name>
   <tag></tag>
   <elementGuidId>30cfa66a-abdc-4771-93be-111cb5419040</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>loading</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>



                


	
		
			
			
DWI CITRA NANDHINI PUTRI
[DWI]Change Password|Logout
			
		
	 
	
    
        
    
        

            /* &lt;![CDATA[ */

            function closePop(refresher) {

                if (refresher != null) {
                    var btnRefresh = document.getElementById(refresher);
                    
                    if (btnRefresh != null) btnRefresh.click();
                }
                
                hidePopWin(false);
            }

            /* ]]> */
            
        

	

        /* &lt;![CDATA[ */

        function clickLogout() {
            var btnLogout = document.getElementById(&quot;frmMain:btnLogout&quot;);
            btnLogout.click();
        }
            
        /* ]]> */
    
                
                    
                        
    Cash - Cash Transaction Payment FormError while sending AccTran task to next stage. [Paid Amount must be greather than zero.] /*&lt;![CDATA[*/
.panelColumns td {
        vertical-align: top;
}
/*]]>*/
//&lt;![CDATA[
                closeModal=function(){A4J.AJAX.Submit('frmMain',null,{'similarityGroupingId':'frmMain:j_id38','parameters':{'frmMain:j_id38':'frmMain:j_id38','ajaxSingle':'frmMain:j_id38'} ,'eventsQueue':'mQueueP'} )};
                //]]>
ERRORError while sending AccTran task to next stage. [Paid Amount must be greather than zero.]//&lt;![CDATA[
Richfaces.componentControl.attachAvailable('#frmMain\\:modalMessage_','onmaskclick','#frmMain\\:modalMessage_','hide')
//]]>
//&lt;![CDATA[
new ModalPanel('frmMain:modalMessage_',
                                {
                                        width: 500,
                                        height: -1,

                                        minWidth: -1,
                                        minHeight: -1,

                                        resizeable: false,
                                        moveable: false,

                                        left: &quot;auto&quot;,
                                        top: &quot;auto&quot;,

                                        zindex: 1000,onresize: '',onmove: '',onshow: '',onhide: '',onbeforeshow: '',onbeforehide: '',
                                        domElementAttachment: &quot;&quot;,                               
                                        keepVisualState: false,
                                        showWhenRendered: false,
                                        selectBehavior: &quot;disable&quot;,

                                        autosized: true,
                                        overlapEmbedObjects: false});
//]]>



    

        if (document.title == &quot;&quot;) {
            document.title = &quot;:: MBF IT Core System 1.2.21 ::&quot;;
        } else {
            document.title = &quot;:: MBF IT Core System - Cash - Cash Transaction Payment Form 1.2.21 ::&quot;;
        }

    
		
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
                var target = rootPath + 'Task/Comment/form.xhtml?appModule=AccTran&amp;idModule=CTRAN-201909-0006&amp;idTask=35100941';

                showPopWin(target, 500, 320, null);
            }

        
		
		
			Cash Transaction Header
Cash No.
CTRAN-201909-0006
Period	2019
	2020
	03
	04
	05
	06
	07
	08
	09
	10
	11
	12

Payment Type	Bulk Payment
	Transfer
	Cash

DescriptionPerjalanan Dinas ke Medan
is special case Handling?
Currency	IDR
	JPY
	USD

Rate Type	-

Currency Date	-

Exchange Rate
		
		
		
			Transaction
Request Payment Date12/09/2019
Payment Date
 *&lt;&lt;&lt;September, 2019>>>xSunMonTueWedThuFriSat
361234567378910111213143815161718192021392223242526272840293012345416789101112Sep 12, 2019CleanTodayRichfaces.Calendar.addLocale('en_US', {'weekDayLabels':['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'] ,'weekDayLabelsShort':['Sun','Mon','Tue','Wed','Thu','Fri','Sat'] ,'monthLabels':['January','February','March','April','May','June','July','August','September','October','November','December'] ,'monthLabelsShort':['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'] ,'minDaysInFirstWeek':1,'firstWeekDay':0} );
new Calendar('frmMain:cashTrxPaymentDate', 
			&quot;en_US&quot;,{'currentDate':new Date(2019,8,12),'onchanged':function(event){callOverlay();A4J.AJAX.Submit('frmMain',event,{'control':this,'oncomplete':function(request,event,data){endOverlay()},'similarityGroupingId':'frmMain:j_id267','parameters':{'frmMain:j_id267':'frmMain:j_id267','ajaxSingle':'frmMain:cashTrxPaymentDate'} } )}} ,{} ).load();Entry TypeAmountDescriptionExpense TypeAction405006 - TRAVEL ACCOMODATION PJ7 - DISBURSE5,000,000.00Perjalanan Dinas ke MedanOthers
				PAYMENTTotal TransactionIDR5,000,000.00Total in Currency PaymentIDR5,000,000.00Bank ChargeIDRGrand Total TransactionIDR5,000,000.00Paid AmountIDR | (5,000,000.00)RateCurrencyIDRJPYUSDRate Type-Currency Date-Exchange RateBank Account//&lt;![CDATA[
                renderPaymentInfo=function(){A4J.AJAX.Submit('frmMain',null,{'similarityGroupingId':'frmMain:j_id443','parameters':{'ajaxSingle':'frmMain:j_id443','frmMain:j_id443':'frmMain:j_id443'} ,'eventsQueue':'calculateamountQue'} )};
                //]]>
101020-Ekonomi Giro [IDR] - 907.039374.075101030-OCBC NISP [IDR] - 54.58.00030227101040-BBA [IDR] - 102.12.31131101050-BCA Ps Baru [IDR] - 002.302.3358101060-Mega Giro [IDR] - 01.077.0011.667789101070-BCA Thamrin VA [IDR] - 206.331.7888101100-Resona IDR [IDR] - 0103.4157.002101103 CASH IN BANK - BII - IDR [IDR] - 2.138.279.438101200-HSBC [IDR] - 001.043017.068101300-Mizuho IDR [IDR] - 311.514.0151101400-Permata Giro [IDR] - 070.139.2523101401-Permata Syariah [IDR] - 701.484.649101500-BCA Thamrin Main [IDR] - 206.303.6358101502-BCA Thamrin Induk [IDR] - 206.328.8268101600-BNI [IDR] - 284.604.281101601 - BNI VIRTUAL ACCOUNT [IDR] - 471095951102090-Mega Ultima [IDR] - 01.077.0027.677887109020 - REPOSSESSED ASSETS [IDR] -109080 - SUSPENSE ACCOUNT [IDR] - 0216010 - ADVANCES FROM LESSEE [IDR] - --216030 - ADVANCES FROM CUSTOMER [IDR] - --216040 - ADVANCES VIRTUAL ACCOUNT [IDR] - --304010 - GAIN ON EARLY TERMINATION OF LEASE CONTR [IDR] - --304020 - GAIN ON EARLY TERM. OF CONSUMER FIN.CONT [IDR] - --CASH IN BANK UOB [IDR] - 101104OTHERS [IDR] -Petty Cash - BDG [IDR] - 0Petty Cash - CKG [IDR] - 0Petty Cash - FTW [IDR] - 0Petty Cash - PJ6 [IDR] - 0Petty Cash - PJ7 [IDR] - 0Petty Cash - SBY [IDR] - 0Petty Cash - SMG [IDR] - 0Petty Cash - STL [IDR] - 0Petty Cash - TNG [IDR] - 0Petty Cash - LPG [IDR] - 0Petty cash - Makassar [IDR] - 0Petty Cash - PBR [IDR] - 0PETTY CASH - PLG [IDR] - 0Petty Cash - SMR [IDR] - 0Amortize PeriodAmortize  /*&lt;![CDATA[*/
.panelColumns td {
        vertical-align: top;
}
/*]]>*/
//&lt;![CDATA[
                closeModal=function(){A4J.AJAX.Submit('frmMain',null,{'similarityGroupingId':'frmMain:j_id449:0:j_id456','parameters':{'frmMain:j_id449:0:j_id456':'frmMain:j_id449:0:j_id456','ajaxSingle':'frmMain:j_id449:0:j_id456'} ,'eventsQueue':'mQueueP'} )};
                //]]>
WARNING//&lt;![CDATA[
Richfaces.componentControl.attachAvailable('#frmMain\\:j_id449\\:0\\:modalMessage_msgFAAmortize_amtz_','onmaskclick','#frmMain\\:j_id449\\:0\\:modalMessage_msgFAAmortize_amtz_','hide')
//]]>
//&lt;![CDATA[
new ModalPanel('frmMain:j_id449:0:modalMessage_msgFAAmortize_amtz_',
                                {
                                        width: 500,
                                        height: -1,

                                        minWidth: -1,
                                        minHeight: -1,

                                        resizeable: false,
                                        moveable: false,

                                        left: &quot;auto&quot;,
                                        top: &quot;auto&quot;,

                                        zindex: 1000,onresize: '',onmove: '',onshow: '',onhide: '',onbeforeshow: '',onbeforehide: '',
                                        domElementAttachment: &quot;&quot;,                               
                                        keepVisualState: false,
                                        showWhenRendered: false,
                                        selectBehavior: &quot;disable&quot;,

                                        autosized: true,
                                        overlapEmbedObjects: false});
//]]>

Actual AmortizePeriodAmortizeAmortizedPrepaid ExpenseJournal Id//&lt;![CDATA[
new Richfaces.Datascroller('frmMain:j_id449:0:dtAmortize:j_id481', function(event){A4J.AJAX.Submit('frmMain',event,{'ignoreDupResponses':true,'implicitEventsQueue':'frmMain:j_id449:0:dtAmortize:j_id481','similarityGroupingId':'frmMain:j_id449:0:dtAmortize:j_id481','parameters':{'frmMain:j_id449:0:dtAmortize:j_id481':event.memo.page,'ajaxSingle':'frmMain:j_id449:0:dtAmortize:j_id481'} ,'containerId':'frmMain:j_id449:0:dtAmortize:j_id480'} ); return false;});
//]]>

        /* &lt;![CDATA[ */

        function showMessage(handlerId, proggressWord) {

            var wrapper = document.getElementById(&quot;frmMain:pageMessage_&quot; + handlerId);
            wrapper.style.display = &quot;block&quot;;

            var img = document.getElementById(&quot;frmMain:msgImage_&quot; + handlerId);
            img.src = rootPath + &quot;img/loading-small.gif&quot;;

            var msg = document.getElementById(&quot;frmMain:msgContent_&quot; + handlerId);
            msg.innerHTML = proggressWord + &quot;...&quot;;
            msg.className = &quot;info&quot;;
        }

        function hideMessage(handlerId) {
            var wrapper = document.getElementById(&quot;frmMain:pageMessage_&quot; + handlerId);
            wrapper.style.display = &quot;none&quot;;
        }

        /* ]]> */

    
		
				
					Remaining Balance Petty Cash
IDR 32,085,897.00
				
		Back to Home//&lt;![CDATA[
new ToolTip(&quot;frmMain:j_id494&quot;,&quot;frmMain:btnA_goToHome&quot;,{'showEvent':'mouseover','horizontalOffset':30,'direction':'top\x2Dleft','followMouse':true} );
//]]>
Save//&lt;![CDATA[
new ToolTip(&quot;frmMain:j_id497&quot;,&quot;frmMain:btnAL_save&quot;,{'showEvent':'mouseover','horizontalOffset':30,'direction':'top\x2Dleft','followMouse':true} );
//]]>
Send To Checker//&lt;![CDATA[
new ToolTip(&quot;frmMain:j_id500&quot;,&quot;frmMain:btnA_wfNext&quot;,{'showEvent':'mouseover','horizontalOffset':30,'direction':'top\x2Dleft','followMouse':true} );
//]]>
Void//&lt;![CDATA[
new ToolTip(&quot;frmMain:j_id509&quot;,&quot;frmMain:btnA_wfVoid&quot;,{'showEvent':'mouseover','horizontalOffset':30,'direction':'top\x2Dleft','followMouse':true} );
//]]>
Back to List//&lt;![CDATA[
new ToolTip(&quot;frmMain:j_id518&quot;,&quot;frmMain:btnA_goToList&quot;,{'showEvent':'mouseover','horizontalOffset':30,'direction':'top\x2Dleft','followMouse':true} );
//]]>
 
		
            /* &lt;![CDATA[ */
            function openForm(idTask, width, height) {
                var target = rootPath + 'Cash/AccTran/formTrans.xhtml';
                if (idTask != &quot;&quot;)
                    target += '?frmMain:hdnIdTask=' + idTask ;

                showPopWin(target, width, height, null);
            }

            function openEditForm(idTask,editId, width, height) {
                var target = rootPath + 'Cash/AccTran/formTrans.xhtml';
                if (idTask != &quot;&quot;)
                    target += '?frmMain:hdnIdTask=' + idTask ;
                if (editId != &quot;&quot;)
                    target += '&amp;frmMain:editId=' + editId ;

                showPopWin(target, width, height, null);
            }

            function openEditForm(idTask,editId, width, height, panelTransfer) {
                var target = rootPath + 'Cash/AccTran/formTrans.xhtml';
                if (idTask != &quot;&quot;)
                    target += '?frmMain:hdnIdTask=' + idTask ;
                if (editId != &quot;&quot;)
                    target += '&amp;frmMain:editId=' + editId ;
                if (panelTransfer != &quot;&quot;)
                    target += '&amp;frmMain:panelTransfer=' + panelTransfer ;

                showPopWin(target, width, height, null);
            }
            
            function remove(idToRemove) {
                var hdnRemove = document.getElementById(&quot;frmMain:hdnRemove&quot;);
                hdnRemove.value = idToRemove;

                var btnRemove = document.getElementById(&quot;frmMain:btnRemove&quot;);
                btnRemove.click();
            }
            /* ]]>*/
         
	
    
        
    
        

            /* &lt;![CDATA[ */

            function closePop(refresher) {

                if (refresher != null) {
                    var btnRefresh = document.getElementById(refresher);
                    
                    if (btnRefresh != null) btnRefresh.click();
                }
                
                hidePopWin(false);
            }

            /* ]]> */
            
        
		
.sb_test_column1 {
	vertical-align: top;
	text-align: left;
	padding-right: 5px;
}

.sb_test_column2 {
	vertical-align: middle;
	text-align: center;
	padding-left: 5px;
}

		

			
		
            function processObjectsChange(output, output2, suggestion) {
                output.value = suggestion.getSelectedItems().pluck('accountName');
                output2.value = suggestion.getSelectedItems().pluck('bankId');
            }

            function processObjectsChangeBeneficiary(output, output2, suggestion) {
                output.value = suggestion.getSelectedItems().pluck('accountNo');
                output2.value = suggestion.getSelectedItems().pluck('bankId');
            }

            function processNpwpChange(output, suggestion) {
                output.value = suggestion.getSelectedItems().pluck('accountNo');
            }
        
                        
                    

                HomeFixed Asset General Ledger Internal Payment Batch ProcessFunding Time Deposit Facility Insurance Procurement Payment General Setting Report BackEnd Tools Logout new RichFaces.Menu.Layer('frmMain:j_id545_menu',{'hideDelay':800,'delay':50} ).asDropDown('frmMain:j_id545',{'oncollapse':function(event){showflash()},'onexpand':function(event){hideflash()}} ).addItems([['frmMain:j_id547'] ,['frmMain:j_id566',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id582',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id592',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id617'] ,['frmMain:j_id618',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id633',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id639',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id685',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id691',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id698',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id714',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id764',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id772',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id776'] ] );DisposeInsurance  new RichFaces.Menu.Layer('frmMain:j_id566_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id566',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id572'] ,['frmMain:j_id573',{'closeOnClick':false,'flagGroup':1} ] ] );Non-Vehicle Vehicle  new RichFaces.Menu.Layer('frmMain:j_id573_menu').asSubMenu('frmMain:j_id566_menu','frmMain:j_id573',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id574',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id577',{'closeOnClick':false,'flagGroup':1} ] ] );ListPrint new RichFaces.Menu.Layer('frmMain:j_id574_menu').asSubMenu('frmMain:j_id573_menu','frmMain:j_id574',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id575'] ,['frmMain:j_id576'] ] );ListSubmission new RichFaces.Menu.Layer('frmMain:j_id577_menu').asSubMenu('frmMain:j_id573_menu','frmMain:j_id577',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id578'] ,['frmMain:j_id579'] ] );Journal new RichFaces.Menu.Layer('frmMain:j_id582_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id582',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id583'] ] );Cash OverbookCash TransactionFA Service Lawyer/Professional Collector Legal &amp; CollectionLegal &amp; Collection SettlementGA AdvanceGA SettlementBulk PaymentSetting  new RichFaces.Menu.Layer('frmMain:j_id592_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id592',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id593'] ,['frmMain:j_id594'] ,['frmMain:j_id595',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id602',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id606'] ,['frmMain:j_id607'] ,['frmMain:j_id608'] ,['frmMain:j_id609'] ,['frmMain:j_id611'] ,['frmMain:j_id612',{'closeOnClick':false,'flagGroup':1} ] ] );FA Service RequisitionBenchmarkWorking OrderPrepaymentInvoicePayment new RichFaces.Menu.Layer('frmMain:j_id595_menu').asSubMenu('frmMain:j_id592_menu','frmMain:j_id595',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id596'] ,['frmMain:j_id597'] ,['frmMain:j_id598'] ,['frmMain:j_id599'] ,['frmMain:j_id600'] ,['frmMain:j_id601'] ] );Proposal Lawyer/Professional CollectorPayment Lawyer/Professional Collector new RichFaces.Menu.Layer('frmMain:j_id602_menu').asSubMenu('frmMain:j_id592_menu','frmMain:j_id602',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id604'] ,['frmMain:j_id605'] ] );Bank AccountEntry Type3rd Party CollectorEntertainment And Gift new RichFaces.Menu.Layer('frmMain:j_id612_menu').asSubMenu('frmMain:j_id592_menu','frmMain:j_id612',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id613'] ,['frmMain:j_id614'] ,['frmMain:j_id615'] ,['frmMain:j_id616'] ] );GuaranteeGuarantee FeeFacilityLoanLoan PaymentSwapSwap PaymentSetting  new RichFaces.Menu.Layer('frmMain:j_id618_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id618',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id619'] ,['frmMain:j_id620'] ,['frmMain:j_id621'] ,['frmMain:j_id625'] ,['frmMain:j_id626'] ,['frmMain:j_id627'] ,['frmMain:j_id628'] ,['frmMain:j_id629',{'closeOnClick':false,'flagGroup':1} ] ] );LenderSwap BankGuarantor new RichFaces.Menu.Layer('frmMain:j_id629_menu').asSubMenu('frmMain:j_id618_menu','frmMain:j_id629',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id630'] ,['frmMain:j_id631'] ,['frmMain:j_id632'] ] );RegisterRolloverReceiveBreakClosing new RichFaces.Menu.Layer('frmMain:j_id633_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id633',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id634'] ,['frmMain:j_id635'] ,['frmMain:j_id636'] ,['frmMain:j_id637'] ,['frmMain:j_id638'] ] );Facility SimulationFacility RegisterRequest DisbursementDisbursement2nd DisbursementInquiry Facilty Termination SimulationIncentiveSale Repossess new RichFaces.Menu.Layer('frmMain:j_id639_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id639',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id640'] ,['frmMain:j_id641'] ,['frmMain:j_id644'] ,['frmMain:j_id647'] ,['frmMain:j_id648'] ,['frmMain:j_id649',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id658'] ,['frmMain:j_id660'] ,['frmMain:j_id666'] ] );Installment Status new RichFaces.Menu.Layer('frmMain:j_id649_menu').asSubMenu('frmMain:j_id639_menu','frmMain:j_id649',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id650'] ] );EndorsementInsurance PolicyInsurance CompanyInsurance Payment new RichFaces.Menu.Layer('frmMain:j_id685_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id685',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id686'] ,['frmMain:j_id687'] ,['frmMain:j_id688'] ,['frmMain:j_id689'] ] );PrepaymentInvoicePayment new RichFaces.Menu.Layer('frmMain:j_id691_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id691',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id695'] ,['frmMain:j_id696'] ,['frmMain:j_id697'] ] );By Instrument Cash / TransferVirtual PaymentPayment PointInquiry Standing Instruction  new RichFaces.Menu.Layer('frmMain:j_id698_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id698',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id699',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id706'] ,['frmMain:j_id707'] ,['frmMain:j_id708'] ,['frmMain:j_id709',{'closeOnClick':false,'flagGroup':1} ] ,['frmMain:j_id711',{'closeOnClick':false,'flagGroup':1} ] ] );Instrument (Non Cash)PostponeSend to BankClearing ResultReturn InstrumentWithdraw Instrument new RichFaces.Menu.Layer('frmMain:j_id699_menu').asSubMenu('frmMain:j_id698_menu','frmMain:j_id699',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id700'] ,['frmMain:j_id701'] ,['frmMain:j_id702'] ,['frmMain:j_id703'] ,['frmMain:j_id704'] ,['frmMain:j_id705'] ] );Actual Payment Schedule new RichFaces.Menu.Layer('frmMain:j_id709_menu').asSubMenu('frmMain:j_id698_menu','frmMain:j_id709',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id710'] ] );Register Standing InstructionReceiving Result new RichFaces.Menu.Layer('frmMain:j_id711_menu').asSubMenu('frmMain:j_id698_menu','frmMain:j_id711',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id712'] ,['frmMain:j_id713'] ] );Parameter  new RichFaces.Menu.Layer('frmMain:j_id714_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id714',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id721',{'closeOnClick':false,'flagGroup':1} ] ] );BankGeneric Parameter new RichFaces.Menu.Layer('frmMain:j_id721_menu').asSubMenu('frmMain:j_id714_menu','frmMain:j_id721',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id722'] ,['frmMain:j_id728'] ] );New ReportCustom ReportExisting Report new RichFaces.Menu.Layer('frmMain:j_id764_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id764',{'direction':'right\x2Dup'} ).addItems([['frmMain:j_id765'] ,['frmMain:j_id766'] ,['frmMain:j_id767'] ] ); new RichFaces.Menu.Layer('frmMain:j_id772_menu').asSubMenu('frmMain:j_id545_menu','frmMain:j_id772',{'direction':'right\x2Dup'} );You have 0 reminder(s)

	
        //&lt;![CDATA[
        function redirect(target) {
            location.href = '/Fintegrity/' + target
        }
        
        function redirectParam(target, parameter) {
            if (parameter != null)
                target += '?parameter=' + parameter;

            location.href = '/Fintegrity/' + target
        }

        function hideflash()
        {
            /* hide all flash in the page */
            flash = document.getElementsByTagName('embed')
            for (var i = 0; i &lt; flash.length; i++)
            {
                flash[i].style.visibility = 'hidden';
            }
        }

        function showflash()
        {
            /* show all flash */
            flash = document.getElementsByTagName('embed')
            for (var i = 0; i &lt; flash.length; i++)
            {
                flash[i].style.visibility = 'visible';
            }
        }

        function stopReturnKey(evt) {
            var evt = (evt) ? evt : ((event) ? event : null);
            var node = (evt.target) ? evt.target : ((evt.srcElement) ? evt.srcElement : null);
            if ((evt.keyCode == 13) &amp;&amp; (node.type==&quot;text&quot;))  {return false;}
        }

        document.onkeypress = stopReturnKey;
        //]]>
    
                
                    

                        function arrangeSize() {
                            try {
                                var content = document.getElementById(&quot;contentWrapper&quot;);
                                content.style.height = document.documentElement.clientHeight - 113 + 'px';
                            }
                            catch(err) {
                                try {
                                    content = document.getElementById(&quot;frmMain:contentWrapper&quot;);
                                    content.style.height = document.documentElement.clientHeight - 113 + 'px';
                                }
                                catch(err) {
                                    window.location.reload();
                                }
                            }
                        }

                        addEvent(window, &quot;load&quot;, arrangeSize);
                        addEvent(window, &quot;resize&quot;, arrangeSize);

                    

Processing...new ModalPanel('modalPanel',
				{
					width: 150,
					height: 40,

					minWidth: -1,
					minHeight: -1,

					resizeable: false,
					moveable: false,

					left: &quot;auto&quot;,
					top: &quot;auto&quot;,

					zindex: 200,onresize: '',onmove: '',onshow: '',onhide: '',onbeforeshow: '',onbeforehide: '',
					domElementAttachment: &quot;&quot;,				
					keepVisualState: false,
					showWhenRendered: false,
					selectBehavior: &quot;disable&quot;,

					autosized: false,
					overlapEmbedObjects: false});  
        
    
    
    
Closeid(&quot;overlay&quot;)A4J.AJAX._scriptEvaluated=true;</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;loading&quot;]/body[@class=&quot;loading&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>
