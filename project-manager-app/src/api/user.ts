import request from '@/utils/request'

export function 方法名(id: string) {
  return request({
    // url：请求后端的地址
    // method: 请求方法
    // params： get参数，建议传到url上
    // data：post参数，是个对象，传进来JSON序列化下
    url: `oApi/order/${id}`,
    method: 'get',
  })
}

// 发送get请求
export function getUser(id: any) {
  return request({
    url: `user/getUser/${id}`,
    method: 'get'
  })
}
// 发送post请求
export function addUser(data: any) {
  return request({
    url: 'user/addUser',
    method: 'post',
    data: JSON.stringify(data)
  })
}