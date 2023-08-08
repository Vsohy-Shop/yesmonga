package com.google.rpc;

import com.google.protobuf.C34417m1;
import com.google.rpc.PreconditionFailure;
import java.util.List;

/* renamed from: com.google.rpc.h */
public interface C34573h extends C34417m1 {
    PreconditionFailure.Violation getViolations(int i);

    int getViolationsCount();

    List<PreconditionFailure.Violation> getViolationsList();
}
