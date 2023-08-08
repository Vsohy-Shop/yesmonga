package com.google.mlkit.vision.barcode;

import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C40808s;
import com.google.mlkit.vision.barcode.C33982a;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: com.google.mlkit.vision.barcode.c */
public class C34004c {

    /* renamed from: a */
    public final int f82599a;
    @Nullable

    /* renamed from: b */
    public final Executor f82600b;

    /* renamed from: com.google.mlkit.vision.barcode.c$a */
    public static class C34005a {

        /* renamed from: a */
        public int f82601a = 0;
        @Nullable

        /* renamed from: b */
        public Executor f82602b;

        @C0359n0
        /* renamed from: a */
        public C34004c mo98926a() {
            return new C34004c(this.f82601a, this.f82602b, (C34008f) null);
        }

        @C0359n0
        /* renamed from: b */
        public C34005a mo98927b(@C33982a.C33985b int i, @RecentlyNonNull @C33982a.C33985b int... iArr) {
            this.f82601a = i;
            if (iArr != null) {
                for (int i2 : iArr) {
                    this.f82601a = i2 | this.f82601a;
                }
            }
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C34005a mo98928c(@RecentlyNonNull Executor executor) {
            this.f82602b = executor;
            return this;
        }
    }

    public /* synthetic */ C34004c(int i, Executor executor, C34008f fVar) {
        this.f82599a = i;
        this.f82600b = executor;
    }

    /* renamed from: a */
    public final int mo98922a() {
        return this.f82599a;
    }

    @RecentlyNullable
    /* renamed from: b */
    public final Executor mo98923b() {
        return this.f82600b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C34004c)) {
            return false;
        }
        C34004c cVar = (C34004c) obj;
        if (this.f82599a != cVar.f82599a || !C40808s.m166010b(this.f82600b, cVar.f82600b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f82599a), this.f82600b);
    }
}
