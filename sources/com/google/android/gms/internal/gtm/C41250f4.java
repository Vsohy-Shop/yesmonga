package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.gtm.f4 */
public final class C41250f4 {

    /* renamed from: a */
    public int f104578a;

    /* renamed from: b */
    public final ByteArrayOutputStream f104579b = new ByteArrayOutputStream();

    /* renamed from: c */
    public final /* synthetic */ C41274g4 f104580c;

    public C41250f4(C41274g4 g4Var) {
        this.f104580c = g4Var;
    }

    /* renamed from: a */
    public final int mo135357a() {
        return this.f104578a;
    }

    /* renamed from: b */
    public final boolean mo135358b(C41706y3 y3Var) {
        C40843u.m166202l(y3Var);
        int i = this.f104578a;
        this.f104580c.mo135742P();
        if (i + 1 > C41560s1.m168320g()) {
            return false;
        }
        String X = this.f104580c.mo135394X(y3Var, false);
        if (X == null) {
            this.f104580c.mo135745S().mo135211Z(y3Var, "Error formatting hit");
            return true;
        }
        byte[] bytes = X.getBytes();
        int length = bytes.length;
        this.f104580c.mo135742P();
        if (length > C41560s1.m168319f()) {
            this.f104580c.mo135745S().mo135211Z(y3Var, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.f104579b.size() > 0) {
            length++;
        }
        int size = this.f104579b.size();
        this.f104580c.mo135742P();
        if (size + length > C41634v3.f105097B.mo135909b().intValue()) {
            return false;
        }
        try {
            if (this.f104579b.size() > 0) {
                this.f104579b.write(C41274g4.f104609e);
            }
            this.f104579b.write(bytes);
            this.f104578a++;
            return true;
        } catch (IOException e) {
            this.f104580c.mo135755r("Failed to write payload when batching hits", e);
            return true;
        }
    }

    /* renamed from: c */
    public final byte[] mo135359c() {
        return this.f104579b.toByteArray();
    }
}
