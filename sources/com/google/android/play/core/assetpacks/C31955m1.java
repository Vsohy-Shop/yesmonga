package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C32016c;
import com.google.android.play.core.internal.C32062k;

/* renamed from: com.google.android.play.core.assetpacks.m1 */
public final class C31955m1 {

    /* renamed from: e */
    public static final C32062k f77969e = new C32062k("ExtractorTaskFinder");

    /* renamed from: a */
    public final C31942j1 f77970a;

    /* renamed from: b */
    public final C31906c0 f77971b;

    /* renamed from: c */
    public final C31950l0 f77972c;

    /* renamed from: d */
    public final C32016c f77973d;

    public C31955m1(C31942j1 j1Var, C31906c0 c0Var, C31950l0 l0Var, C32016c cVar) {
        this.f77970a = j1Var;
        this.f77971b = c0Var;
        this.f77972c = l0Var;
        this.f77973d = cVar;
    }

    /* renamed from: c */
    public static boolean m129578c(C31927g1 g1Var) {
        int i = g1Var.f77870f;
        return i == 1 || i == 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.play.core.assetpacks.z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.play.core.assetpacks.z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.play.core.assetpacks.w1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.play.core.assetpacks.w1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.play.core.assetpacks.m2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.play.core.assetpacks.m2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.google.android.play.core.assetpacks.f2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.google.android.play.core.assetpacks.f2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: com.google.android.play.core.assetpacks.l1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: com.google.android.play.core.assetpacks.l1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: com.google.android.play.core.assetpacks.f2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: com.google.android.play.core.assetpacks.m2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: com.google.android.play.core.assetpacks.w1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: com.google.android.play.core.assetpacks.z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: com.google.android.play.core.assetpacks.l1} */
    /* JADX WARNING: type inference failed for: r0v48, types: [com.google.android.play.core.assetpacks.l1] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        if (r0 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        f77969e.mo92775a("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r7.f77850a), r7.f77852c.f77836a);
        r11 = r7.f77850a;
        r8 = r7.f77852c;
        r10 = new com.google.android.play.core.assetpacks.C32011z1(r11, r8.f77836a, r7.f77851b, r8.f77837b);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.support.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.C31951l1 mo92629a() {
        /*
            r32 = this;
            r1 = r32
            com.google.android.play.core.assetpacks.j1 r0 = r1.f77970a     // Catch:{ all -> 0x03e0 }
            r0.mo92599a()     // Catch:{ all -> 0x03e0 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x03e0 }
            r2.<init>()     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.j1 r0 = r1.f77970a     // Catch:{ all -> 0x03e0 }
            java.util.Map r0 = r0.mo92601c()     // Catch:{ all -> 0x03e0 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x03e0 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x03e0 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x03e0 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.f1 r3 = (com.google.android.play.core.assetpacks.C31922f1) r3     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r4 = r3.f77852c     // Catch:{ all -> 0x03e0 }
            int r4 = r4.f77838c     // Catch:{ all -> 0x03e0 }
            boolean r4 = com.google.android.play.core.assetpacks.C31987t1.m129673h(r4)     // Catch:{ all -> 0x03e0 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x03e0 }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x03e0 }
            r3 = 0
            if (r0 == 0) goto L_0x0041
        L_0x003b:
            com.google.android.play.core.assetpacks.j1 r0 = r1.f77970a
            r0.mo92600b()
            return r3
        L_0x0041:
            com.google.android.play.core.common.c r0 = r1.f77973d     // Catch:{ all -> 0x03e0 }
            boolean r0 = r0.mo92715a()     // Catch:{ all -> 0x03e0 }
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x00ac
            com.google.android.play.core.assetpacks.c0 r0 = r1.f77971b     // Catch:{ all -> 0x03e0 }
            java.util.Map r0 = r0.mo92525s()     // Catch:{ all -> 0x03e0 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x03e0 }
        L_0x0056:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x03e0 }
            if (r8 == 0) goto L_0x00a2
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.f1 r8 = (com.google.android.play.core.assetpacks.C31922f1) r8     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r9 = r8.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r9.f77836a     // Catch:{ all -> 0x03e0 }
            java.lang.Object r9 = r0.get(r9)     // Catch:{ all -> 0x03e0 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x03e0 }
            if (r9 == 0) goto L_0x0056
            com.google.android.play.core.assetpacks.e1 r10 = r8.f77852c     // Catch:{ all -> 0x03e0 }
            long r10 = r10.f77837b     // Catch:{ all -> 0x03e0 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x03e0 }
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0056
            com.google.android.play.core.internal.k r0 = f77969e     // Catch:{ all -> 0x03e0 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x03e0 }
            int r9 = r8.f77850a     // Catch:{ all -> 0x03e0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03e0 }
            r7[r6] = r9     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r9 = r8.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r9.f77836a     // Catch:{ all -> 0x03e0 }
            r7[r5] = r9     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = "Found promote pack task for session %s with pack %s."
            r0.mo92775a(r9, r7)     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.l1 r0 = new com.google.android.play.core.assetpacks.l1     // Catch:{ all -> 0x03e0 }
            int r7 = r8.f77850a     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r8 = r8.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r8 = r8.f77836a     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.c0 r9 = r1.f77971b     // Catch:{ all -> 0x03e0 }
            r9.mo92506J(r8)     // Catch:{ all -> 0x03e0 }
            r0.<init>(r7, r8, r3)     // Catch:{ all -> 0x03e0 }
            goto L_0x00a3
        L_0x00a2:
            r0 = r3
        L_0x00a3:
            if (r0 != 0) goto L_0x00a6
            goto L_0x00ac
        L_0x00a6:
            com.google.android.play.core.assetpacks.j1 r2 = r1.f77970a
            r2.mo92600b()
            return r0
        L_0x00ac:
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03e0 }
        L_0x00b0:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x03e0 }
            if (r7 == 0) goto L_0x011b
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.f1 r7 = (com.google.android.play.core.assetpacks.C31922f1) r7     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.c0 r8 = r1.f77971b     // Catch:{ IOException -> 0x00fc }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f77852c     // Catch:{ IOException -> 0x00fc }
            java.lang.String r10 = r9.f77836a     // Catch:{ IOException -> 0x00fc }
            int r11 = r7.f77851b     // Catch:{ IOException -> 0x00fc }
            long r12 = r9.f77837b     // Catch:{ IOException -> 0x00fc }
            int r8 = r8.mo92497A(r10, r11, r12)     // Catch:{ IOException -> 0x00fc }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f77852c     // Catch:{ IOException -> 0x00fc }
            java.util.List<com.google.android.play.core.assetpacks.g1> r9 = r9.f77840e     // Catch:{ IOException -> 0x00fc }
            int r9 = r9.size()     // Catch:{ IOException -> 0x00fc }
            if (r8 != r9) goto L_0x00b0
            com.google.android.play.core.internal.k r0 = f77969e     // Catch:{ all -> 0x03e0 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x03e0 }
            int r9 = r7.f77850a     // Catch:{ all -> 0x03e0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03e0 }
            r8[r6] = r9     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r9.f77836a     // Catch:{ all -> 0x03e0 }
            r8[r5] = r9     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.mo92775a(r9, r8)     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.z1 r0 = new com.google.android.play.core.assetpacks.z1     // Catch:{ all -> 0x03e0 }
            int r11 = r7.f77850a     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r8 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r12 = r8.f77836a     // Catch:{ all -> 0x03e0 }
            int r13 = r7.f77851b     // Catch:{ all -> 0x03e0 }
            long r14 = r8.f77837b     // Catch:{ all -> 0x03e0 }
            r10 = r0
            r10.<init>(r11, r12, r13, r14)     // Catch:{ all -> 0x03e0 }
            goto L_0x011c
        L_0x00fc:
            r0 = move-exception
            com.google.android.play.core.assetpacks.bk r2 = new com.google.android.play.core.assetpacks.bk     // Catch:{ all -> 0x03e0 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x03e0 }
            int r4 = r7.f77850a     // Catch:{ all -> 0x03e0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x03e0 }
            r3[r6] = r4     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r4 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r4 = r4.f77836a     // Catch:{ all -> 0x03e0 }
            r3[r5] = r4     // Catch:{ all -> 0x03e0 }
            java.lang.String r4 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x03e0 }
            int r4 = r7.f77850a     // Catch:{ all -> 0x03e0 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x03e0 }
            throw r2     // Catch:{ all -> 0x03e0 }
        L_0x011b:
            r0 = r3
        L_0x011c:
            if (r0 != 0) goto L_0x00a6
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03e0 }
        L_0x0122:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x03e0 }
            r8 = 3
            if (r7 == 0) goto L_0x01a5
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.f1 r7 = (com.google.android.play.core.assetpacks.C31922f1) r7     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            int r9 = r9.f77838c     // Catch:{ all -> 0x03e0 }
            boolean r9 = com.google.android.play.core.assetpacks.C31987t1.m129673h(r9)     // Catch:{ all -> 0x03e0 }
            if (r9 == 0) goto L_0x0122
            com.google.android.play.core.assetpacks.e1 r9 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.util.List<com.google.android.play.core.assetpacks.g1> r9 = r9.f77840e     // Catch:{ all -> 0x03e0 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x03e0 }
        L_0x0141:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x03e0 }
            if (r10 == 0) goto L_0x0122
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.g1 r10 = (com.google.android.play.core.assetpacks.C31927g1) r10     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.c0 r11 = r1.f77971b     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r12 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r13 = r12.f77836a     // Catch:{ all -> 0x03e0 }
            int r14 = r7.f77851b     // Catch:{ all -> 0x03e0 }
            long r3 = r12.f77837b     // Catch:{ all -> 0x03e0 }
            java.lang.String r15 = r10.f77865a     // Catch:{ all -> 0x03e0 }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r3
            java.io.File r3 = r11.mo92531y(r12, r13, r14, r16)     // Catch:{ all -> 0x03e0 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x03e0 }
            if (r3 == 0) goto L_0x01a2
            com.google.android.play.core.internal.k r0 = f77969e     // Catch:{ all -> 0x03e0 }
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x03e0 }
            int r4 = r7.f77850a     // Catch:{ all -> 0x03e0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x03e0 }
            r3[r6] = r4     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r4 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r4 = r4.f77836a     // Catch:{ all -> 0x03e0 }
            r3[r5] = r4     // Catch:{ all -> 0x03e0 }
            java.lang.String r4 = r10.f77865a     // Catch:{ all -> 0x03e0 }
            r9 = 2
            r3[r9] = r4     // Catch:{ all -> 0x03e0 }
            java.lang.String r4 = "Found merge task for session %s with pack %s and slice %s."
            r0.mo92775a(r4, r3)     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.w1 r0 = new com.google.android.play.core.assetpacks.w1     // Catch:{ all -> 0x03e0 }
            int r3 = r7.f77850a     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r4 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r4.f77836a     // Catch:{ all -> 0x03e0 }
            int r7 = r7.f77851b     // Catch:{ all -> 0x03e0 }
            long r11 = r4.f77837b     // Catch:{ all -> 0x03e0 }
            java.lang.String r4 = r10.f77865a     // Catch:{ all -> 0x03e0 }
            r18 = r0
            r19 = r3
            r20 = r9
            r21 = r7
            r22 = r11
            r24 = r4
            r18.<init>(r19, r20, r21, r22, r24)     // Catch:{ all -> 0x03e0 }
            goto L_0x01a6
        L_0x01a2:
            r3 = 0
            r4 = 2
            goto L_0x0141
        L_0x01a5:
            r0 = 0
        L_0x01a6:
            if (r0 != 0) goto L_0x00a6
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03e0 }
        L_0x01ac:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x03e0 }
            if (r3 == 0) goto L_0x0230
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.f1 r3 = (com.google.android.play.core.assetpacks.C31922f1) r3     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r4 = r3.f77852c     // Catch:{ all -> 0x03e0 }
            int r4 = r4.f77838c     // Catch:{ all -> 0x03e0 }
            boolean r4 = com.google.android.play.core.assetpacks.C31987t1.m129673h(r4)     // Catch:{ all -> 0x03e0 }
            if (r4 == 0) goto L_0x01ac
            com.google.android.play.core.assetpacks.e1 r4 = r3.f77852c     // Catch:{ all -> 0x03e0 }
            java.util.List<com.google.android.play.core.assetpacks.g1> r4 = r4.f77840e     // Catch:{ all -> 0x03e0 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x03e0 }
        L_0x01ca:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x03e0 }
            if (r7 == 0) goto L_0x01ac
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.g1 r7 = (com.google.android.play.core.assetpacks.C31927g1) r7     // Catch:{ all -> 0x03e0 }
            boolean r9 = r1.mo92630b(r3, r7)     // Catch:{ all -> 0x03e0 }
            if (r9 == 0) goto L_0x01ca
            com.google.android.play.core.assetpacks.c0 r10 = r1.f77971b     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r9 = r3.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r11 = r9.f77836a     // Catch:{ all -> 0x03e0 }
            int r12 = r3.f77851b     // Catch:{ all -> 0x03e0 }
            long r13 = r9.f77837b     // Catch:{ all -> 0x03e0 }
            java.lang.String r15 = r7.f77865a     // Catch:{ all -> 0x03e0 }
            java.io.File r9 = r10.mo92530x(r11, r12, r13, r15)     // Catch:{ all -> 0x03e0 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x03e0 }
            if (r9 == 0) goto L_0x01ca
            com.google.android.play.core.internal.k r0 = f77969e     // Catch:{ all -> 0x03e0 }
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x03e0 }
            int r9 = r3.f77850a     // Catch:{ all -> 0x03e0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03e0 }
            r4[r6] = r9     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r9 = r3.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r9.f77836a     // Catch:{ all -> 0x03e0 }
            r4[r5] = r9     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r7.f77865a     // Catch:{ all -> 0x03e0 }
            r10 = 2
            r4[r10] = r9     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.mo92775a(r9, r4)     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.m2 r0 = new com.google.android.play.core.assetpacks.m2     // Catch:{ all -> 0x03e0 }
            int r4 = r3.f77850a     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r9 = r3.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r10 = r9.f77836a     // Catch:{ all -> 0x03e0 }
            int r3 = r3.f77851b     // Catch:{ all -> 0x03e0 }
            long r11 = r9.f77837b     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r7.f77865a     // Catch:{ all -> 0x03e0 }
            java.lang.String r7 = r7.f77866b     // Catch:{ all -> 0x03e0 }
            r18 = r0
            r19 = r4
            r20 = r10
            r21 = r3
            r22 = r11
            r24 = r9
            r25 = r7
            r18.<init>(r19, r20, r21, r22, r24, r25)     // Catch:{ all -> 0x03e0 }
            goto L_0x0231
        L_0x0230:
            r0 = 0
        L_0x0231:
            if (r0 != 0) goto L_0x00a6
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x03e0 }
        L_0x0237:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x03e0 }
            r4 = 4
            if (r0 == 0) goto L_0x031e
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x03e0 }
            r7 = r0
            com.google.android.play.core.assetpacks.f1 r7 = (com.google.android.play.core.assetpacks.C31922f1) r7     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r0 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            int r0 = r0.f77838c     // Catch:{ all -> 0x03e0 }
            boolean r0 = com.google.android.play.core.assetpacks.C31987t1.m129673h(r0)     // Catch:{ all -> 0x03e0 }
            if (r0 == 0) goto L_0x0237
            com.google.android.play.core.assetpacks.e1 r0 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.util.List<com.google.android.play.core.assetpacks.g1> r0 = r0.f77840e     // Catch:{ all -> 0x03e0 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x03e0 }
        L_0x0257:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x03e0 }
            if (r0 == 0) goto L_0x0237
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x03e0 }
            r10 = r0
            com.google.android.play.core.assetpacks.g1 r10 = (com.google.android.play.core.assetpacks.C31927g1) r10     // Catch:{ all -> 0x03e0 }
            boolean r0 = m129578c(r10)     // Catch:{ all -> 0x03e0 }
            if (r0 != 0) goto L_0x0257
            com.google.android.play.core.assetpacks.i2 r0 = new com.google.android.play.core.assetpacks.i2     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.c0 r11 = r1.f77971b     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r12 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r13 = r12.f77836a     // Catch:{ all -> 0x03e0 }
            int r14 = r7.f77851b     // Catch:{ all -> 0x03e0 }
            r16 = r9
            long r8 = r12.f77837b     // Catch:{ all -> 0x03e0 }
            java.lang.String r12 = r10.f77865a     // Catch:{ all -> 0x03e0 }
            r18 = r0
            r19 = r11
            r20 = r13
            r21 = r14
            r22 = r8
            r24 = r12
            r18.<init>(r19, r20, r21, r22, r24)     // Catch:{ all -> 0x03e0 }
            int r0 = r0.mo92591k()     // Catch:{ IOException -> 0x028e }
            goto L_0x029c
        L_0x028e:
            r0 = move-exception
            r8 = r0
            com.google.android.play.core.internal.k r0 = f77969e     // Catch:{ all -> 0x03e0 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x03e0 }
            r9[r6] = r8     // Catch:{ all -> 0x03e0 }
            java.lang.String r8 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.mo92776b(r8, r9)     // Catch:{ all -> 0x03e0 }
            r0 = r6
        L_0x029c:
            r8 = -1
            if (r0 == r8) goto L_0x0319
            java.util.List<com.google.android.play.core.assetpacks.d1> r8 = r10.f77868d     // Catch:{ all -> 0x03e0 }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.d1 r8 = (com.google.android.play.core.assetpacks.C31912d1) r8     // Catch:{ all -> 0x03e0 }
            boolean r8 = r8.f77825a     // Catch:{ all -> 0x03e0 }
            if (r8 == 0) goto L_0x0319
            com.google.android.play.core.internal.k r3 = f77969e     // Catch:{ all -> 0x03e0 }
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x03e0 }
            int r9 = r10.f77869e     // Catch:{ all -> 0x03e0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03e0 }
            r8[r6] = r9     // Catch:{ all -> 0x03e0 }
            int r9 = r7.f77850a     // Catch:{ all -> 0x03e0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03e0 }
            r8[r5] = r9     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r9.f77836a     // Catch:{ all -> 0x03e0 }
            r11 = 2
            r8[r11] = r9     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r10.f77865a     // Catch:{ all -> 0x03e0 }
            r11 = 3
            r8[r11] = r9     // Catch:{ all -> 0x03e0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03e0 }
            r8[r4] = r9     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r3.mo92775a(r9, r8)     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.l0 r3 = r1.f77972c     // Catch:{ all -> 0x03e0 }
            int r8 = r7.f77850a     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r9.f77836a     // Catch:{ all -> 0x03e0 }
            java.lang.String r11 = r10.f77865a     // Catch:{ all -> 0x03e0 }
            java.io.InputStream r31 = r3.mo92620a(r8, r9, r11, r0)     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.r0 r3 = new com.google.android.play.core.assetpacks.r0     // Catch:{ all -> 0x03e0 }
            int r8 = r7.f77850a     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r11 = r9.f77836a     // Catch:{ all -> 0x03e0 }
            int r12 = r7.f77851b     // Catch:{ all -> 0x03e0 }
            long r13 = r9.f77837b     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r10.f77865a     // Catch:{ all -> 0x03e0 }
            int r15 = r10.f77869e     // Catch:{ all -> 0x03e0 }
            java.util.List<com.google.android.play.core.assetpacks.d1> r10 = r10.f77868d     // Catch:{ all -> 0x03e0 }
            int r27 = r10.size()     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r7 = r7.f77852c     // Catch:{ all -> 0x03e0 }
            long r4 = r7.f77839d     // Catch:{ all -> 0x03e0 }
            int r7 = r7.f77838c     // Catch:{ all -> 0x03e0 }
            r18 = r3
            r19 = r8
            r20 = r11
            r21 = r12
            r22 = r13
            r24 = r9
            r25 = r15
            r26 = r0
            r28 = r4
            r30 = r7
            r18.<init>(r19, r20, r21, r22, r24, r25, r26, r27, r28, r30, r31)     // Catch:{ all -> 0x03e0 }
            goto L_0x031f
        L_0x0319:
            r9 = r16
            r8 = 3
            goto L_0x0257
        L_0x031e:
            r3 = 0
        L_0x031f:
            if (r3 != 0) goto L_0x003b
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03e0 }
        L_0x0325:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x03e0 }
            if (r2 == 0) goto L_0x03d4
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.f1 r2 = (com.google.android.play.core.assetpacks.C31922f1) r2     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r3 = r2.f77852c     // Catch:{ all -> 0x03e0 }
            int r3 = r3.f77838c     // Catch:{ all -> 0x03e0 }
            boolean r3 = com.google.android.play.core.assetpacks.C31987t1.m129673h(r3)     // Catch:{ all -> 0x03e0 }
            if (r3 == 0) goto L_0x0325
            com.google.android.play.core.assetpacks.e1 r3 = r2.f77852c     // Catch:{ all -> 0x03e0 }
            java.util.List<com.google.android.play.core.assetpacks.g1> r3 = r3.f77840e     // Catch:{ all -> 0x03e0 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x03e0 }
        L_0x0343:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x03e0 }
            if (r4 == 0) goto L_0x0325
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.g1 r4 = (com.google.android.play.core.assetpacks.C31927g1) r4     // Catch:{ all -> 0x03e0 }
            boolean r5 = m129578c(r4)     // Catch:{ all -> 0x03e0 }
            if (r5 == 0) goto L_0x0343
            java.util.List<com.google.android.play.core.assetpacks.d1> r5 = r4.f77868d     // Catch:{ all -> 0x03e0 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.d1 r5 = (com.google.android.play.core.assetpacks.C31912d1) r5     // Catch:{ all -> 0x03e0 }
            boolean r5 = r5.f77825a     // Catch:{ all -> 0x03e0 }
            if (r5 == 0) goto L_0x0343
            boolean r5 = r1.mo92630b(r2, r4)     // Catch:{ all -> 0x03e0 }
            if (r5 != 0) goto L_0x0343
            com.google.android.play.core.internal.k r0 = f77969e     // Catch:{ all -> 0x03e0 }
            r5 = 4
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x03e0 }
            int r5 = r4.f77870f     // Catch:{ all -> 0x03e0 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03e0 }
            r3[r6] = r5     // Catch:{ all -> 0x03e0 }
            int r5 = r2.f77850a     // Catch:{ all -> 0x03e0 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03e0 }
            r7 = 1
            r3[r7] = r5     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r5 = r2.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r5 = r5.f77836a     // Catch:{ all -> 0x03e0 }
            r8 = 2
            r3[r8] = r5     // Catch:{ all -> 0x03e0 }
            java.lang.String r5 = r4.f77865a     // Catch:{ all -> 0x03e0 }
            r9 = 3
            r3[r9] = r5     // Catch:{ all -> 0x03e0 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.mo92775a(r5, r3)     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.l0 r0 = r1.f77972c     // Catch:{ all -> 0x03e0 }
            int r3 = r2.f77850a     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r5 = r2.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r5 = r5.f77836a     // Catch:{ all -> 0x03e0 }
            java.lang.String r7 = r4.f77865a     // Catch:{ all -> 0x03e0 }
            java.io.InputStream r30 = r0.mo92620a(r3, r5, r7, r6)     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.f2 r0 = new com.google.android.play.core.assetpacks.f2     // Catch:{ all -> 0x03e0 }
            int r3 = r2.f77850a     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r5 = r2.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r5 = r5.f77836a     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.c0 r6 = r1.f77971b     // Catch:{ all -> 0x03e0 }
            int r20 = r6.mo92506J(r5)     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.c0 r6 = r1.f77971b     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r7 = r2.f77852c     // Catch:{ all -> 0x03e0 }
            java.lang.String r7 = r7.f77836a     // Catch:{ all -> 0x03e0 }
            long r21 = r6.mo92507K(r7)     // Catch:{ all -> 0x03e0 }
            int r6 = r2.f77851b     // Catch:{ all -> 0x03e0 }
            com.google.android.play.core.assetpacks.e1 r2 = r2.f77852c     // Catch:{ all -> 0x03e0 }
            long r7 = r2.f77837b     // Catch:{ all -> 0x03e0 }
            int r2 = r4.f77870f     // Catch:{ all -> 0x03e0 }
            java.lang.String r9 = r4.f77865a     // Catch:{ all -> 0x03e0 }
            long r10 = r4.f77867c     // Catch:{ all -> 0x03e0 }
            r17 = r0
            r18 = r3
            r19 = r5
            r23 = r6
            r24 = r7
            r26 = r2
            r27 = r9
            r28 = r10
            r17.<init>(r18, r19, r20, r21, r23, r24, r26, r27, r28, r30)     // Catch:{ all -> 0x03e0 }
            goto L_0x03d5
        L_0x03d4:
            r0 = 0
        L_0x03d5:
            if (r0 == 0) goto L_0x03d9
            goto L_0x00a6
        L_0x03d9:
            com.google.android.play.core.assetpacks.j1 r0 = r1.f77970a
            r0.mo92600b()
            r2 = 0
            return r2
        L_0x03e0:
            r0 = move-exception
            com.google.android.play.core.assetpacks.j1 r2 = r1.f77970a
            r2.mo92600b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C31955m1.mo92629a():com.google.android.play.core.assetpacks.l1");
    }

    /* renamed from: b */
    public final boolean mo92630b(C31922f1 f1Var, C31927g1 g1Var) {
        C31906c0 c0Var = this.f77971b;
        C31917e1 e1Var = f1Var.f77852c;
        return new C31938i2(c0Var, e1Var.f77836a, f1Var.f77851b, e1Var.f77837b, g1Var.f77865a).mo92592l();
    }
}
