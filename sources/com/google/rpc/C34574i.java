package com.google.rpc;

import com.google.protobuf.C34417m1;
import com.google.rpc.QuotaFailure;
import java.util.List;

/* renamed from: com.google.rpc.i */
public interface C34574i extends C34417m1 {
    QuotaFailure.Violation getViolations(int i);

    int getViolationsCount();

    List<QuotaFailure.Violation> getViolationsList();
}
