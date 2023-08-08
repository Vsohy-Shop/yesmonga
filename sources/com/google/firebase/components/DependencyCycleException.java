package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class DependencyCycleException extends DependencyException {
    private final List<C32580g<?>> componentsInCycle;

    public DependencyCycleException(List<C32580g<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.componentsInCycle = list;
    }

    /* renamed from: a */
    public List<C32580g<?>> mo94675a() {
        return this.componentsInCycle;
    }
}
