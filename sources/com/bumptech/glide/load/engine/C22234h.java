package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: com.bumptech.glide.load.engine.h */
public abstract class C22234h {

    /* renamed from: a */
    public static final C22234h f57123a = new C22235a();

    /* renamed from: b */
    public static final C22234h f57124b = new C22236b();

    /* renamed from: c */
    public static final C22234h f57125c = new C22237c();

    /* renamed from: d */
    public static final C22234h f57126d = new C22238d();

    /* renamed from: e */
    public static final C22234h f57127e = new C22239e();

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    public class C22235a extends C22234h {
        /* renamed from: a */
        public boolean mo66121a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo66122b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo66123c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        /* renamed from: d */
        public boolean mo66124d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$b */
    public class C22236b extends C22234h {
        /* renamed from: a */
        public boolean mo66121a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo66122b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo66123c(DataSource dataSource) {
            return false;
        }

        /* renamed from: d */
        public boolean mo66124d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$c */
    public class C22237c extends C22234h {
        /* renamed from: a */
        public boolean mo66121a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo66122b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo66123c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public boolean mo66124d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$d */
    public class C22238d extends C22234h {
        /* renamed from: a */
        public boolean mo66121a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo66122b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo66123c(DataSource dataSource) {
            return false;
        }

        /* renamed from: d */
        public boolean mo66124d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$e */
    public class C22239e extends C22234h {
        /* renamed from: a */
        public boolean mo66121a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo66122b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo66123c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        /* renamed from: d */
        public boolean mo66124d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo66121a();

    /* renamed from: b */
    public abstract boolean mo66122b();

    /* renamed from: c */
    public abstract boolean mo66123c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo66124d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
