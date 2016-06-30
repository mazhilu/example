package com.asto.domain.domain;

public class TestCoreSeek {
	public static void main(String[] args) throws SphinxException {
		StringBuffer q = new StringBuffer();
		String host = "127.0.0.1";
		int port = 9313;
		int mode = SphinxClient.SPH_MATCH_EXTENDED2;
		String index = "zz91crm";
		int offset = 0;
		int limit = 40;
		int sortMode = SphinxClient.SPH_SORT_EXTENDED;
		String sortClause = "";
		String groupBy = "";
		String groupSort = "";
        
		SphinxClient cl = new SphinxClient();
		cl.SetServer(host, port);
//		cl.SetWeights(new int[]{100,1});
		cl.SetMatchMode(mode);
		cl.SetLimits(offset, limit,25);
		cl.SetSortMode(sortMode,"date_added desc");
		cl.SetFilter("is_del", 0, false);
		q.append("@(title) 工程 -(塑料)");
		SphinxResult rs = cl.Query(q.toString(), index);
		if(rs!=null){
			for(int i=0;i<rs.matches.length;i++){
				SphinxMatch info = rs.matches[i];
				 String pp=""+info.docId;
				 System.out.println(pp);
			}
		}
	}
}


