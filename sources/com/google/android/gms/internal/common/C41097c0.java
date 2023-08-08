package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.google.android.gms.internal.common.c0 */
public final class C41097c0 implements Iterable {

    /* renamed from: a */
    public final /* synthetic */ CharSequence f104387a;

    /* renamed from: b */
    public final /* synthetic */ C41101e0 f104388b;

    public C41097c0(C41101e0 e0Var, CharSequence charSequence) {
        this.f104388b = e0Var;
        this.f104387a = charSequence;
    }

    public final Iterator iterator() {
        return this.f104388b.mo134921h(this.f104387a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C12361b.f30260k);
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(C41122x.m166996a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append(", ");
                    sb.append(C41122x.m166996a(it.next(), ", "));
                }
            }
            sb.append(C12361b.f30261l);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
