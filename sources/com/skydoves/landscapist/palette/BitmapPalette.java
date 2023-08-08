package com.skydoves.landscapist.palette;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.compose.runtime.internal.C8567o;
import androidx.palette.graphics.C19868b;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class BitmapPalette {
    @C12579k

    /* renamed from: e */
    public static final C35346a f86836e = new C35346a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f86837f = 8;
    @C12579k

    /* renamed from: g */
    public static final C11677z<LruCache<Object, C19868b>> f86838g = C10864b0.m38747b(LazyThreadSafetyMode.NONE, BitmapPalette$Companion$cache$2.f86843f);
    @C12580l

    /* renamed from: a */
    public Object f86839a;

    /* renamed from: b */
    public final boolean f86840b;
    @C12580l

    /* renamed from: c */
    public final C35348b f86841c;
    @C12580l

    /* renamed from: d */
    public final C35349c f86842d;

    /* renamed from: com.skydoves.landscapist.palette.BitmapPalette$a */
    public static final class C35346a {
        public /* synthetic */ C35346a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final LruCache<Object, C19868b> mo105861a() {
            return (LruCache) BitmapPalette.f86838g.getValue();
        }

        public C35346a() {
        }
    }

    public BitmapPalette() {
        this((Object) null, false, (C35348b) null, (C35349c) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static final void m145696e(BitmapPalette bitmapPalette, Object obj, C19868b bVar) {
        Intrinsics.checkNotNullParameter(bitmapPalette, "this$0");
        Intrinsics.checkNotNullParameter(obj, "$model");
        if (bVar != null) {
            if (bitmapPalette.f86840b) {
                f86836e.mo105861a().put(obj, bVar);
            }
            C35349c cVar = bitmapPalette.f86842d;
            if (cVar != null) {
                cVar.mo105864a(bVar);
            }
        }
    }

    @C12579k
    /* renamed from: c */
    public final BitmapPalette mo105859c(@C12580l Object obj) {
        this.f86839a = obj;
        return this;
    }

    /* renamed from: d */
    public final void mo105860d(@C12580l Bitmap bitmap) {
        Object obj;
        C19868b.C19870b bVar;
        C19868b bVar2;
        if (bitmap != null && (obj = this.f86839a) != null) {
            if (!this.f86840b || (bVar2 = f86836e.mo105861a().get(obj)) == null) {
                C35348b bVar3 = this.f86841c;
                if (bVar3 == null) {
                    bVar = null;
                } else {
                    bVar = bVar3.mo105863a(new C19868b.C19870b(bitmap));
                }
                if (bVar == null) {
                    bVar = new C19868b.C19870b(bitmap);
                }
                bVar.mo58694f(new C35347a(this, obj));
                return;
            }
            C35349c cVar = this.f86842d;
            if (cVar != null) {
                cVar.mo105864a(bVar2);
            }
        }
    }

    public BitmapPalette(@C12580l Object obj, boolean z, @C12580l C35348b bVar, @C12580l C35349c cVar) {
        this.f86839a = obj;
        this.f86840b = z;
        this.f86841c = bVar;
        this.f86842d = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitmapPalette(Object obj, boolean z, C35348b bVar, C35349c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : cVar);
    }
}
