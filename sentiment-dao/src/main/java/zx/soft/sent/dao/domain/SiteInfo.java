package zx.soft.sent.dao.domain;

/**
 * 分类列表，采集站点 
 * 
 * @author wanggang
 *
 */
public class SiteInfo {

	/*
	ZDZY——>	url
	ZDQY——>	zone
	ZDMS——>	description
	ZDMC——>	source_name
	ZDBS——>platform
	SHZT——>	status
	PCXXID——>spider_id
	PCLX——>	spider_type
	ID——>source_id
	GSFL——>source_type
	GSD——>source_code
	GLYDH——>contact
	GLY——>admin
	FJD——>root
	CSLB——>	params
	CJZID——>uid
	CJSJ——>	timestamp
	BZ——>identify
	*/

	private String url; // 站点主页
	private int zone; // 站点区域(1境内2境外)
	private String description; // 站点描述
	private String source_name; // 站点名称
	private int platform; // 站点标识(1资讯2论坛3微博4博客5QQ6搜索7回复8邮件)
	private int status; // 审核状态
	private int spider_id; // 爬虫信息ID
	private String spider_type; // 爬虫类型
	private int source_id; // 采集站点ID
	private int source_type; // 归属分类(1全网搜索2网络巡检4重点关注)
	private int source_code; // 站点归属地(市级代码)
	private String contact; // 站点联系方式
	private String admin; // 站点负责人
	private long root; // 父节点
	private String params; // 参数名键值对列表
	private long uid; // 创建人ID
	private long timestamp; // 创建时间
	private int identify; // 标识

	@Override
	public String toString() {
		return "SiteInfo:[url=" + url + ",zone=" + zone + ",description=" + description + ",source_name=" + source_name
				+ ",platform=" + platform + ",status=" + status + ",spider_id=" + spider_id + ",spider_type="
				+ spider_type + ",source_id=" + source_id + ",source_type=" + source_type + ",source_code="
				+ source_code + ",contact=" + contact + ",admin=" + admin + ",root=" + root + ",params=" + params
				+ ",uid=" + uid + ",timestamp=" + timestamp + ",identify=" + identify + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSource_name() {
		return source_name;
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	public int getPlatform() {
		return platform;
	}

	public void setPlatform(int platform) {
		this.platform = platform;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getSpider_id() {
		return spider_id;
	}

	public void setSpider_id(int spider_id) {
		this.spider_id = spider_id;
	}

	public String getSpider_type() {
		return spider_type;
	}

	public void setSpider_type(String spider_type) {
		this.spider_type = spider_type;
	}

	public int getSource_id() {
		return source_id;
	}

	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}

	public int getSource_type() {
		return source_type;
	}

	public void setSource_type(int source_type) {
		this.source_type = source_type;
	}

	public int getSource_code() {
		return source_code;
	}

	public void setSource_code(int source_code) {
		this.source_code = source_code;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public long getRoot() {
		return root;
	}

	public void setRoot(long root) {
		this.root = root;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public int getIdentify() {
		return identify;
	}

	public void setIdentify(int identify) {
		this.identify = identify;
	}

}
