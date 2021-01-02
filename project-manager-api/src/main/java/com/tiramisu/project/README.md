一个模块（user、enterprise、project、迭代、需求）对应套
    1、对应一个 entity包下的类  User           (Enterprise ...)
        内容对应表字段，加@Data
    2、controller ->           UserController (EnterpriseController...)
        记得加 @RestController
    3、mapper ->               UserMapper     (EnterpriseMapper) 和 resource/mapper 对应的xml
        创建接口 interface 加@Mapper

功能怎么写
    1、controller 里面写逻辑
    2、xxxMapper.java 里申明方法  xxxMapper.xml 写sql，方法名对应标签 Id