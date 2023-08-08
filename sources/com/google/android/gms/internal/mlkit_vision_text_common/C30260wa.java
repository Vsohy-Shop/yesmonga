package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.IOException;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.wa */
public final class C30260wa {

    /* renamed from: a */
    public final String f72315a = "\n";

    public C30260wa(String str) {
    }

    /* renamed from: a */
    public static C30260wa m121917a(String str) {
        return new C30260wa("\n");
    }

    /* renamed from: c */
    public static final CharSequence m121918c(@CheckForNull Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* renamed from: b */
    public final String mo85381b(Iterable<? extends Object> iterable) {
        Iterator<? extends Object> it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb.append(m121918c(it.next()));
                while (it.hasNext()) {
                    sb.append(this.f72315a);
                    sb.append(m121918c(it.next()));
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
