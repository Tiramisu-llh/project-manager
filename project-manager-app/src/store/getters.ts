const getters = {
    //  为了更简单的取state的值，可以写在getters中
    id: (state: any) => state.app.user.id
}
  
export default getters;