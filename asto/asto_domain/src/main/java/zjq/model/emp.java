package zjq.model;

public class emp {
	private usertest userto;
	
    private Integer ip;

    private Integer userid;

    private Integer id;
    
    public usertest getUserto() {
		return userto;
	}

	public void setUserto(usertest userto) {
		this.userto = userto;
	}

	public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}