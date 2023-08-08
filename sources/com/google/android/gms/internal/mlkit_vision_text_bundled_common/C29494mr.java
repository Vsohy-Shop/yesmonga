package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.mr */
public final class C29494mr {

    /* renamed from: a */
    public final String f71358a = "\n";

    public C29494mr(String str) {
    }

    /* renamed from: a */
    public static C29494mr m120742a(String str) {
        return new C29494mr("\n");
    }

    /* renamed from: c */
    public static final CharSequence m120743c(@CheckForNull Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* renamed from: b */
    public final String mo84722b(Iterable<? extends Object> iterable) {
        Iterator<? extends Object> it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb.append(m120743c(it.next()));
                while (it.hasNext()) {
                    sb.append(this.f71358a);
                    sb.append(m120743c(it.next()));
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
