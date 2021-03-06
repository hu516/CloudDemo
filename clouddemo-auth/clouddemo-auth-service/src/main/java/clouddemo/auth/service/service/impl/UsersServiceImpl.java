package clouddemo.auth.service.service.impl;

import clouddemo.auth.api.pojo.Users;
import clouddemo.auth.api.service.UsersService;
import clouddemo.auth.service.dao.UsersMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Title       : UsersServiceImpl
 * Package     : clouddemo.platform.service.service.impl
 * Description :
 * Create on   : 2018/12/19 14:09
 *
 * @author Yinglong.Hu
 * @version v1.0.0
 * <p>
 * 修改历史:
 * 修改人  :
 * 修改日期:
 * 修改描述:
 * -------------------------------------------
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;

    @Override
    public Users selectByPrimaryKey(Integer id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public Users selectByUid(String uid) {
        return usersMapper.selectByUid(uid);
    }
}
