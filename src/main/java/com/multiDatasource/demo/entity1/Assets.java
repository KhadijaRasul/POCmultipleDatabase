package com.multiDatasource.demo.entity1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Instant;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tblAsset")
public class Assets
{
	@Id
	private Long id;
	private Long intTenantID;
	private Long intSysCode;
	private Boolean bolHasAddress;
	private Boolean bolImportedPriceFromV2;
	private Boolean bolIsBillToFacility;
	private Boolean bolIsCritical;
	private Boolean bolIsOnline;
	private Boolean bolIsPool;
	private Boolean bolIsRegion;
	private Boolean bolIsShippingOrReceivingFacility;
	private Boolean bolIsSite;
	private Boolean bolManageInventory;
	private Boolean bolNeedsCalibration;
	private Boolean bolUsersCanClockInOut;
	private String cBarcode;
	private Double dblLastPrice;
	private Double dblLatitude;
	private Double dblLongitude;
	private Double dblWeightedPrice;
	private Instant dtmCreated;
	private Instant dtmLastUpdated;
	private Long intAccountID;
	private Long intAssetLocationID;
	private Long intAssetParentID;
	private Long intAssetStatusID;
	private Long intCategoryID;
	private Long intChargeDepartmentID;
	private Long intCountryID;
	private Long intCreatedForPurchaseOrderLineItemID;
	private Long intCreatedFromReceiptLineItemID;
	private Long intKind;
	private Long intLastMeterReadingUnitID;
	private Long intLastPriceCurrencyID;
	private Long intLayoutX;
	private Long intLayoutY;
	private Long intPhysicalLocationID;
	private Long intSiteID;
	private Long intSuperAssetCategoryID;
	private Long intSuperCategoryID;
	private Long intSuperCategorySysCode;
	private Long intUpdated;
	private Double qtyMinStockCount;
	private Double qtyStockCount;
	private String strAddress;
	private String strAisle;
	private String strBarcode;
	private String strBinNumber;
	private String strCity;
	private String strCode;
	private String strCustomerIds;
	private String strCustomers;
	private String strDescription;
	private String strInventoryCode;
	private String strMASourceProduct;
	private String strMake;
	private String strModel;
	private String strName;
	private String strNotes;
	private String strPostalCode;
	private String strProvince;
	private String strQuotingTerms;
	private String strRFQTriggerSiteLevelSetting;
	private String strRow;
	private String strSerialNumber;
	private String strShippingTerms;
	private String strStockLocation;
	private String strSysCustomColumnValues;
	private String strTimezone;
	private String strUnspcCode;
	private String strUuid;
	private String strVendorIds;
	private String strVendors;

}
