package pack1;

public class SelectProcessImpl implements SelectService{
	private DataDao dataDao;
	
//	public SelectProcessImpl() {
//		// TODO Auto-generated constructor stub
//	}
	
	public SelectProcessImpl(DataDao dataDao) {
		this.dataDao = dataDao;
	}
	
	public SelectProcessImpl(DataDao dataDao, String aa) {
		this.dataDao = dataDao;
	}
	
	public void selectProcess() {
		System.out.println("BL 수행 : selectProcess 진행 중 db 처리");
		dataDao.selectData();
	}
}
