package androidx.emoji2.text.flatbuffer;

import java.util.function.Supplier;

/* renamed from: androidx.emoji2.text.flatbuffer.x */
public final /* synthetic */ class C19076x extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ Supplier f48542a;

    public /* synthetic */ C19076x(Supplier supplier) {
        this.f48542a = supplier;
    }

    public /* synthetic */ Object initialValue() {
        return this.f48542a.get();
    }
}
