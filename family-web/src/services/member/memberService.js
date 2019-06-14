import request from '@/utils/request';
import config from '@/config/urlConfig';

/**
 * 获取成员列表
 * @param {参数} params 
 */
export async function getMemberList(params) {

    return request(`${config.members.getMembers}?${stringify(params)}`);
}
