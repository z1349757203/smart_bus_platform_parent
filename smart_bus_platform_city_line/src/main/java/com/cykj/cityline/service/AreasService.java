package com.cykj.cityline.service;

import com.cykj.pojo.AreasChild;
import com.cykj.util.Result;

import java.util.HashMap;
import java.util.List;

public interface AreasService {
    /**
     *  根据城市或省份分页查询省份、城市、站点数量、线路数量
     * @param map
     * @return
     */
    public Result findAreasByPage(HashMap<String, Object> map, int startSize, int pageSize);

    /**
     * 根据城市类型查询所有城市
     * @param type
     * @return
     */
    public Result findAreasByType(int type);
    /**
     * 新增城市
     */
    public Result insArea(AreasChild areasChild);
    /**
     * 修改城市信息
     * @param areasChild
     * @return
     */
    public Result updAreaById(AreasChild areasChild);

    /**
     * 根据城市名查找城市，确保没有冗余的城市名
     * @param areasChild
     * @return
     */
    public AreasChild findAreaByCityName (AreasChild areasChild);
    /**
     * 查询省份和省份下的城市
     * @return
     */
    public Result findAreaTree();

    /**
     * 根据类型和父类id查找城市或者省份
     * @param areasChild
     * @return
     */
    public List<AreasChild> findAreasByTypeParentId(AreasChild areasChild);
    /**
     * 查询所有城市信息
     */
    public List<AreasChild> findAreasAll();
}
