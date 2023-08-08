package kotlinx.serialization.json.internal;

import kotlin.C11076d0;
import kotlin.jvm.C11287e;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo22516d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "", "begin", "C", "end", "<init>", "(Ljava/lang/String;ICC)V", "a", "b", "c", "d", "kotlinx-serialization-json"}, mo22517k = 1, mo22518mv = {1, 6, 0})
public enum WriteMode {
    OBJ(C12361b.f30258i, C12361b.f30259j),
    LIST(C12361b.f30260k, C12361b.f30261l),
    MAP(C12361b.f30258i, C12361b.f30259j),
    POLY_OBJ(C12361b.f30260k, C12361b.f30261l);
    
    @C11287e
    public final char begin;
    @C11287e
    public final char end;

    /* access modifiers changed from: public */
    WriteMode(char c, char c2) {
        this.begin = c;
        this.end = c2;
    }
}
