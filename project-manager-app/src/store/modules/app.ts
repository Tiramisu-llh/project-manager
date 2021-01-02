// 1 先定义 state
const state = {
  loading: false,
  loginDialog: false,
  user: {
    id: 123,
    name: 'zs'
  }
};
// 2 写mutations
const mutations = {
  SET_LOADING: (state: any, loading: any) => {
    state.loading = loading;
  },
  SET_LOGIN_DIALOG: (state: any, isShow: any) => {
    state.loginDialog = isShow;
  },
};
// 3 写actions，调用这个函数
const actions = {
  setLoading(ctx: any, loading: any) {
    ctx.commit("SET_LOADING", loading);
  },
  closeLoginDialog(ctx: any) {
    ctx.commit("SET_LOGIN_DIALOG", false);
  },
  openLoginDialog(ctx: any) {
    ctx.commit("SET_LOGIN_DIALOG", true);
  },
};

export default {
  namespaced: true,
  state,
  mutations,
  actions,
};
