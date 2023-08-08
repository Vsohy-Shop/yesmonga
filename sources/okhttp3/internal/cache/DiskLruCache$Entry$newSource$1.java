package okhttp3.internal.cache;

import kotlin.C11076d0;
import kotlin.C11079d2;
import okhttp3.internal.cache.DiskLruCache;
import okio.C12510p0;
import okio.C12522u;

@C11076d0(mo22515d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"okhttp3/internal/cache/DiskLruCache$Entry$newSource$1", "Lokio/u;", "Lkotlin/d2;", "close", "", "closed", "Z", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class DiskLruCache$Entry$newSource$1 extends C12522u {
    final /* synthetic */ C12510p0 $fileSource;
    private boolean closed;
    final /* synthetic */ DiskLruCache.Entry this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Entry$newSource$1(DiskLruCache.Entry entry, C12510p0 p0Var, C12510p0 p0Var2) {
        super(p0Var2);
        this.this$0 = entry;
        this.$fileSource = p0Var;
    }

    public void close() {
        super.close();
        if (!this.closed) {
            this.closed = true;
            synchronized (this.this$0.this$0) {
                DiskLruCache.Entry entry = this.this$0;
                entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                if (this.this$0.getLockingSourceCount$okhttp() == 0 && this.this$0.getZombie$okhttp()) {
                    DiskLruCache.Entry entry2 = this.this$0;
                    entry2.this$0.removeEntry$okhttp(entry2);
                }
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }
}
