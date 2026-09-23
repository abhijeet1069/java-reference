package com.satyam.benchmark;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;

/**
 Benchmark                             Mode  Cnt   Score   Error  Units
 StringBenchmarks.stringBuilder        avgt    5   3.070 ± 0.113  us/op
 StringBenchmarks.stringConcatenation  avgt    5  46.351 ± 5.192  us/op

 Here StringBuilder took 3 microseconds, whereas StringConcatenation 46 microseconds,
 clearly 15x slower
 **/

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(
        iterations = 5,
        time = 1,
        timeUnit = TimeUnit.SECONDS
)

@Measurement(
        iterations = 5,
        time = 1,
        timeUnit = TimeUnit.SECONDS
)
@Fork(2)
public class StringBenchmarks {

    @Benchmark
    public String stringBuilder(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++)
            sb.append(i);
        return sb.toString();
    }

    @Benchmark
    public String stringConcatenation() {
        String result = "";
        for(int i = 0; i < 1000; i++)
            result += i;
        return result;
    }
}