package org.jsoup.select;

import org.jsoup.nodes.C12779j;

public interface NodeFilter {

    public enum FilterResult {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP
    }

    /* renamed from: a */
    FilterResult mo30364a(C12779j jVar, int i);

    /* renamed from: b */
    FilterResult mo30365b(C12779j jVar, int i);
}
