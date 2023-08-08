package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.api.w */
public interface C32445w extends C34417m1 {
    long getBucketCounts(int i);

    int getBucketCountsCount();

    List<Long> getBucketCountsList();

    Distribution.BucketOptions getBucketOptions();

    long getCount();

    Distribution.Exemplar getExemplars(int i);

    int getExemplarsCount();

    List<Distribution.Exemplar> getExemplarsList();

    double getMean();

    Distribution.Range getRange();

    double getSumOfSquaredDeviation();

    boolean hasBucketOptions();

    boolean hasRange();
}
