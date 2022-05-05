package com.sphereex.jmh.shardingsphere5;

import com.sphereex.jmh.jdbc.UnpooledNoneIndexUpdateOnlyBenchmarkBase;
import lombok.SneakyThrows;

import javax.sql.DataSource;
import java.sql.Connection;

public class ShardingSphereUpdateNonIndexBenchmark extends UnpooledNoneIndexUpdateOnlyBenchmarkBase {

    private static final DataSource DATA_SOURCE;

    static {
        DATA_SOURCE = ShardingSpheres.createDataSource();
    }

    @SneakyThrows
    @Override
    public Connection getConnection() {
        return DATA_SOURCE.getConnection();
    }
}
