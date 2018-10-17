/**
 * Author: Akhauri Prateek Shekhar 
 */
package my.retail.model;

import java.util.List;
import java.util.Map;

public class Item {

	private String tcin;
	private Map<String,Object> bundle_components;
	private String dpci;
	private String upc;
	private Map<String,Object> product_description;
	private String parent_items;
	private String buy_url;
	private Map<String,Object> variation;
	private Map<String,Object> enrichment;
	private String return_method;
	private Map<String,Object> handling;
	private Map<String,Object> recall_compliance;
	private Map<String,Object> tax_category;
	private Map<String,Object> display_option;
	private Map<String,Object> fulfillment;
	private Map<String,Object> package_dimensions;
	private Map<String,Object> environmental_segmentation;
	private Map<String,Object> manufacturer;
	private List<Object> product_vendors;
	private Map<String,Object> product_classification;
	private Map<String,Object> product_brand;
	private String item_state;
	private List<Object> specifications;
	private Map<String,Object> attributes;
	private String country_of_origin;
	private String relationship_type_code;
	private boolean subscription_eligible;
	private List<Object> ribbons;
	private List<Object> tags;
	private String estore_item_status_code;
	private boolean is_proposition_65;
	private Map<String,String> return_policies;
	private boolean gifting_enabled;
	
	public Item() {}
			
	public Item(String tcin, Map<String, Object> bundle_components, String dpci, String upc,
			Map<String, Object> product_description, String parent_items, String buy_url,
			Map<String, Object> variation, Map<String, Object> enrichment, String return_method,
			Map<String, Object> handling, Map<String, Object> recall_compliance, Map<String, Object> tax_category,
			Map<String, Object> display_option, Map<String, Object> fulfillment,
			Map<String, Object> package_dimensions, Map<String, Object> environmental_segmentation,
			Map<String, Object> manufacturer, List<Object> product_vendors,
			Map<String, Object> product_classification, Map<String, Object> product_brand, String item_state,
			List<Object> specifications, Map<String, Object> attributes, String country_of_origin,
			String relationship_type_code, boolean subscription_eligible, List<Object> ribbons, List<Object> tags,
			String estore_item_status_code, boolean is_proposition_65, Map<String, String> return_policies,
			boolean gifting_enabled) {
		super();
		this.tcin = tcin;
		this.bundle_components = bundle_components;
		this.dpci = dpci;
		this.upc = upc;
		this.product_description = product_description;
		this.parent_items = parent_items;
		this.buy_url = buy_url;
		this.variation = variation;
		this.enrichment = enrichment;
		this.return_method = return_method;
		this.handling = handling;
		this.recall_compliance = recall_compliance;
		this.tax_category = tax_category;
		this.display_option = display_option;
		this.fulfillment = fulfillment;
		this.package_dimensions = package_dimensions;
		this.environmental_segmentation = environmental_segmentation;
		this.manufacturer = manufacturer;
		this.product_vendors = product_vendors;
		this.product_classification = product_classification;
		this.product_brand = product_brand;
		this.item_state = item_state;
		this.specifications = specifications;
		this.attributes = attributes;
		this.country_of_origin = country_of_origin;
		this.relationship_type_code = relationship_type_code;
		this.subscription_eligible = subscription_eligible;
		this.ribbons = ribbons;
		this.tags = tags;
		this.estore_item_status_code = estore_item_status_code;
		this.is_proposition_65 = is_proposition_65;
		this.return_policies = return_policies;
		this.gifting_enabled = gifting_enabled;
	}

	public String getTcin() {
		return tcin;
	}

	public void setTcin(String tcin) {
		this.tcin = tcin;
	}

	public Map<String, Object> getBundle_components() {
		return bundle_components;
	}

	public void setBundle_components(Map<String, Object> bundle_components) {
		this.bundle_components = bundle_components;
	}

	public String getDpci() {
		return dpci;
	}

	public void setDpci(String dpci) {
		this.dpci = dpci;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public Map<String, Object> getProduct_description() {
		return product_description;
	}

	public void setProduct_description(Map<String, Object> product_description) {
		this.product_description = product_description;
	}

	public String getParent_items() {
		return parent_items;
	}

	public void setParent_items(String parent_items) {
		this.parent_items = parent_items;
	}

	public String getBuy_url() {
		return buy_url;
	}

	public void setBuy_url(String buy_url) {
		this.buy_url = buy_url;
	}

	public Map<String, Object> getVariation() {
		return variation;
	}

	public void setVariation(Map<String, Object> variation) {
		this.variation = variation;
	}

	public Map<String, Object> getEnrichment() {
		return enrichment;
	}

	public void setEnrichment(Map<String, Object> enrichment) {
		this.enrichment = enrichment;
	}

	public String getReturn_method() {
		return return_method;
	}

	public void setReturn_method(String return_method) {
		this.return_method = return_method;
	}

	public Map<String, Object> getHandling() {
		return handling;
	}

	public void setHandling(Map<String, Object> handling) {
		this.handling = handling;
	}

	public Map<String, Object> getRecall_compliance() {
		return recall_compliance;
	}

	public void setRecall_compliance(Map<String, Object> recall_compliance) {
		this.recall_compliance = recall_compliance;
	}

	public Map<String, Object> getTax_category() {
		return tax_category;
	}

	public void setTax_category(Map<String, Object> tax_category) {
		this.tax_category = tax_category;
	}

	public Map<String, Object> getDisplay_option() {
		return display_option;
	}

	public void setDisplay_option(Map<String, Object> display_option) {
		this.display_option = display_option;
	}

	public Map<String, Object> getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(Map<String, Object> fulfillment) {
		this.fulfillment = fulfillment;
	}

	public Map<String, Object> getPackage_dimensions() {
		return package_dimensions;
	}

	public void setPackage_dimensions(Map<String, Object> package_dimensions) {
		this.package_dimensions = package_dimensions;
	}

	public Map<String, Object> getEnvironmental_segmentation() {
		return environmental_segmentation;
	}

	public void setEnvironmental_segmentation(Map<String, Object> environmental_segmentation) {
		this.environmental_segmentation = environmental_segmentation;
	}

	public Map<String, Object> getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Map<String, Object> manufacturer) {
		this.manufacturer = manufacturer;
	}

	public List<Object> getProduct_vendors() {
		return product_vendors;
	}

	public void setProduct_vendors(List<Object> product_vendors) {
		this.product_vendors = product_vendors;
	}

	public Map<String, Object> getProduct_classification() {
		return product_classification;
	}

	public void setProduct_classification(Map<String, Object> product_classification) {
		this.product_classification = product_classification;
	}

	public Map<String, Object> getProduct_brand() {
		return product_brand;
	}

	public void setProduct_brand(Map<String, Object> product_brand) {
		this.product_brand = product_brand;
	}

	public String getItem_state() {
		return item_state;
	}

	public void setItem_state(String item_state) {
		this.item_state = item_state;
	}

	public List<Object> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(List<Object> specifications) {
		this.specifications = specifications;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public String getCountry_of_origin() {
		return country_of_origin;
	}

	public void setCountry_of_origin(String country_of_origin) {
		this.country_of_origin = country_of_origin;
	}

	public String getRelationship_type_code() {
		return relationship_type_code;
	}

	public void setRelationship_type_code(String relationship_type_code) {
		this.relationship_type_code = relationship_type_code;
	}

	public boolean isSubscription_eligible() {
		return subscription_eligible;
	}

	public void setSubscription_eligible(boolean subscription_eligible) {
		this.subscription_eligible = subscription_eligible;
	}

	public List<Object> getRibbons() {
		return ribbons;
	}

	public void setRibbons(List<Object> ribbons) {
		this.ribbons = ribbons;
	}

	public List<Object> getTags() {
		return tags;
	}

	public void setTags(List<Object> tags) {
		this.tags = tags;
	}

	public String getEstore_item_status_code() {
		return estore_item_status_code;
	}

	public void setEstore_item_status_code(String estore_item_status_code) {
		this.estore_item_status_code = estore_item_status_code;
	}

	public boolean isIs_proposition_65() {
		return is_proposition_65;
	}

	public void setIs_proposition_65(boolean is_proposition_65) {
		this.is_proposition_65 = is_proposition_65;
	}

	public Map<String, String> getReturn_policies() {
		return return_policies;
	}

	public void setReturn_policies(Map<String, String> return_policies) {
		this.return_policies = return_policies;
	}

	public boolean isGifting_enabled() {
		return gifting_enabled;
	}

	public void setGifting_enabled(boolean gifting_enabled) {
		this.gifting_enabled = gifting_enabled;
	}

	@Override
	public String toString() {
		return "item [tcin=" + tcin + ", bundle_components=" + bundle_components + ", dpci=" + dpci + ", upc=" + upc
				+ ", product_description=" + product_description + ", parent_items=" + parent_items + ", buy_url="
				+ buy_url + ", variation=" + variation + ", enrichment=" + enrichment + ", return_method="
				+ return_method + ", handling=" + handling + ", recall_compliance=" + recall_compliance
				+ ", tax_category=" + tax_category + ", display_option=" + display_option + ", fulfillment="
				+ fulfillment + ", package_dimensions=" + package_dimensions + ", environmental_segmentation="
				+ environmental_segmentation + ", manufacturer=" + manufacturer + ", product_vendors="
				+ product_vendors + ", product_classification=" + product_classification + ", product_brand="
				+ product_brand + ", item_state=" + item_state + ", specifications=" + specifications
				+ ", attributes=" + attributes + ", country_of_origin=" + country_of_origin
				+ ", relationship_type_code=" + relationship_type_code + ", subscription_eligible="
				+ subscription_eligible + ", ribbons=" + ribbons + ", tags=" + tags + ", estore_item_status_code="
				+ estore_item_status_code + ", is_proposition_65=" + is_proposition_65 + ", return_policies="
				+ return_policies + ", gifting_enabled=" + gifting_enabled + "]";
	}
}