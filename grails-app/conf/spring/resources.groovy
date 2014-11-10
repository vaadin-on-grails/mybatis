import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.mapper.MapperScannerConfigurer

beans = {

    sqlSessionFactory(SqlSessionFactoryBean) {
        dataSource = ref("dataSource")
        mapperLocations = "classpath:com/app/mappers/**/*.xml"
    }

    mapperScannerConfigurer(MapperScannerConfigurer) {
        basePackage = "com.app.mappers"
    }
}
