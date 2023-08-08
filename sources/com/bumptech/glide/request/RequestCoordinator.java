package com.bumptech.glide.request;

public interface RequestCoordinator {

    public enum RequestState {
        f57775a(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        /* access modifiers changed from: public */
        RequestState(boolean z) {
            this.isComplete = z;
        }

        /* renamed from: g */
        public boolean mo66701g() {
            return this.isComplete;
        }
    }

    /* renamed from: a */
    boolean mo66694a();

    /* renamed from: c */
    boolean mo66695c(C22557e eVar);

    /* renamed from: d */
    boolean mo66696d(C22557e eVar);

    /* renamed from: e */
    void mo66697e(C22557e eVar);

    /* renamed from: g */
    void mo66698g(C22557e eVar);

    RequestCoordinator getRoot();

    /* renamed from: j */
    boolean mo66700j(C22557e eVar);
}
