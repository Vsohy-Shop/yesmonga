package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
/* renamed from: com.airbnb.lottie.animation.content.l */
public class C21454l implements C21457n, C21452j {

    /* renamed from: a */
    public final Path f55318a = new Path();

    /* renamed from: b */
    public final Path f55319b = new Path();

    /* renamed from: c */
    public final Path f55320c = new Path();

    /* renamed from: d */
    public final String f55321d;

    /* renamed from: e */
    public final List<C21457n> f55322e = new ArrayList();

    /* renamed from: f */
    public final MergePaths f55323f;

    /* renamed from: com.airbnb.lottie.animation.content.l$a */
    public static /* synthetic */ class C21455a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55324a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode[] r0 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55324a = r0
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55324a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55324a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55324a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55324a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.C21454l.C21455a.<clinit>():void");
        }
    }

    public C21454l(MergePaths mergePaths) {
        this.f55321d = mergePaths.mo64332c();
        this.f55323f = mergePaths;
    }

    /* renamed from: a */
    public final void mo64044a() {
        for (int i = 0; i < this.f55322e.size(); i++) {
            this.f55320c.addPath(this.f55322e.get(i).getPath());
        }
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
        for (int i = 0; i < this.f55322e.size(); i++) {
            this.f55322e.get(i).mo64020b(list, list2);
        }
    }

    @TargetApi(19)
    /* renamed from: c */
    public final void mo64045c(Path.Op op) {
        this.f55319b.reset();
        this.f55318a.reset();
        for (int size = this.f55322e.size() - 1; size >= 1; size--) {
            C21457n nVar = this.f55322e.get(size);
            if (nVar instanceof C21446d) {
                C21446d dVar = (C21446d) nVar;
                List<C21457n> i = dVar.mo64031i();
                for (int size2 = i.size() - 1; size2 >= 0; size2--) {
                    Path path = i.get(size2).getPath();
                    path.transform(dVar.mo64032j());
                    this.f55319b.addPath(path);
                }
            } else {
                this.f55319b.addPath(nVar.getPath());
            }
        }
        C21457n nVar2 = this.f55322e.get(0);
        if (nVar2 instanceof C21446d) {
            C21446d dVar2 = (C21446d) nVar2;
            List<C21457n> i2 = dVar2.mo64031i();
            for (int i3 = 0; i3 < i2.size(); i3++) {
                Path path2 = i2.get(i3).getPath();
                path2.transform(dVar2.mo64032j());
                this.f55318a.addPath(path2);
            }
        } else {
            this.f55318a.set(nVar2.getPath());
        }
        this.f55320c.op(this.f55318a, this.f55319b, op);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64043f(java.util.ListIterator<com.airbnb.lottie.animation.content.C21445c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            com.airbnb.lottie.animation.content.c r0 = (com.airbnb.lottie.animation.content.C21445c) r0
            boolean r1 = r0 instanceof com.airbnb.lottie.animation.content.C21457n
            if (r1 == 0) goto L_0x000d
            java.util.List<com.airbnb.lottie.animation.content.n> r1 = r2.f55322e
            com.airbnb.lottie.animation.content.n r0 = (com.airbnb.lottie.animation.content.C21457n) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.C21454l.mo64043f(java.util.ListIterator):void");
    }

    public String getName() {
        return this.f55321d;
    }

    public Path getPath() {
        this.f55320c.reset();
        if (this.f55323f.mo64333d()) {
            return this.f55320c;
        }
        int i = C21455a.f55324a[this.f55323f.mo64331b().ordinal()];
        if (i == 1) {
            mo64044a();
        } else if (i == 2) {
            mo64045c(Path.Op.UNION);
        } else if (i == 3) {
            mo64045c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            mo64045c(Path.Op.INTERSECT);
        } else if (i == 5) {
            mo64045c(Path.Op.XOR);
        }
        return this.f55320c;
    }
}
