package com.leon.gmall.service;


import com.leon.gmall.beans.UmsMember;
import com.leon.gmall.beans.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.user.service
 * @date 2020/2/6 17:45
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    UmsMember login(UmsMember umsMember);

    void addUserToken(String token, String memberId);

    void addOauthUser(UmsMember umsMember);

    UmsMember checkOauthUser(UmsMember umsCheck);

    UmsMemberReceiveAddress getReceiveAddressById(String receiveAddressId);
}
