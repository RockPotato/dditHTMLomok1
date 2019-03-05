package Kr.patago.dao;

import java.util.List;

import Kr.patago.vo.OmokVO;

public interface IOmokDao {
	public int insert(OmokVO vo);
	public List<OmokVO> selectList();
	public OmokVO selectMax();
	public List<OmokVO> selectListPan();
	public List<OmokVO> selectListPans(OmokVO vo);
	public List<OmokVO> selectListHist(OmokVO vo);
	public List<OmokVO> selectListPanAndOrder(OmokVO vo);
}
