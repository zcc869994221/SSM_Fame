package com.bjsxt.mapper;

import com.bjsxt.pojo.Account;
import org.apache.ibatis.annotations.Param;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/20 13:48
 */
public interface AccountMapper {
    /**
     * 查找用户信息
     * @param cno
     * @param pwd
     * @param money
     * @return Account
     */
    Account selectOne(@Param("cno") String cno,@Param("pwd") String pwd,@Param("money") String money);

    /**
     *执行汇款操作
     * @param cno
     * @param money
     * @return int
     */
    int update1(@Param("cno") String OutCno,@Param("money") String money);

    /**
     *执行收款操作
     * @param cno
     * @param money
     * @return int
     */
    int update2(@Param("cno") String InCno,@Param("money") String money);


}
