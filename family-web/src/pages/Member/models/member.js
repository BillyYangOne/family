import { getMemberList } from '@/services/member/memberService';

export default {
    namespace: 'member',

    state: {

    },  

    effects: {
      
      *fetch(_, { call, put }) {
        const response = yield call(getMemberList);
        yield put({
          type: 'save',
          payload: response,
        });
      },
    },

    reducers: {
      save(state, { payload }) {
        return {
            ...state,
            ...payload,
          };
        },
    },
}