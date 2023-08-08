package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.C20282b0;
import androidx.room.C20293d2;
import androidx.room.C20312g;
import androidx.room.C20323i2;
import androidx.room.C20352p0;
import androidx.work.C21091d;
import androidx.work.WorkInfo;
import androidx.work.impl.model.C21249u;
import java.util.List;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"UnknownNullness"})
@C20312g
/* renamed from: androidx.work.impl.model.v */
public interface C21253v {
    @C12579k
    @C20352p0("SELECT * FROM workspec WHERE state=1")
    /* renamed from: A */
    List<C21249u> mo63518A();

    @C20293d2
    @C20352p0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @C12579k
    /* renamed from: B */
    LiveData<List<C21249u.C21252c>> mo63519B(@C12579k String str);

    @C12579k
    @C20352p0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    /* renamed from: C */
    List<String> mo63520C();

    @C20352p0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    /* renamed from: D */
    boolean mo63521D();

    @C20352p0("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    /* renamed from: E */
    int mo63522E(@C12579k String str);

    @C20293d2
    @C20352p0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @C12579k
    /* renamed from: F */
    List<C21249u.C21252c> mo63523F(@C12579k String str);

    @C20293d2
    @C20352p0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (:ids)")
    @C12579k
    /* renamed from: G */
    LiveData<List<C21249u.C21252c>> mo63524G(@C12579k List<String> list);

    @C20352p0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    /* renamed from: H */
    int mo63525H(@C12579k String str);

    @C20293d2
    @C20352p0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (:ids)")
    @C12579k
    /* renamed from: I */
    List<C21249u.C21252c> mo63526I(@C12579k List<String> list);

    @C12579k
    @C20352p0("SELECT id FROM workspec")
    /* renamed from: J */
    List<String> mo63527J();

    @C20323i2
    /* renamed from: a */
    void mo63528a(@C12579k C21249u uVar);

    @C20352p0("DELETE FROM workspec WHERE id=:id")
    /* renamed from: b */
    void mo63529b(@C12579k String str);

    @C20352p0("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    /* renamed from: c */
    void mo63530c();

    @C20352p0("UPDATE workspec SET period_count=period_count+1 WHERE id=:id")
    /* renamed from: d */
    void mo63531d(@C12579k String str);

    @C20352p0("UPDATE workspec SET generation=generation+1 WHERE id=:id")
    /* renamed from: e */
    void mo63532e(@C12579k String str);

    @C12579k
    @C20352p0("SELECT * FROM workspec WHERE last_enqueue_time >= :startingAt AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC")
    /* renamed from: f */
    List<C21249u> mo63533f(long j);

    @C20282b0(onConflict = 5)
    /* renamed from: g */
    void mo63534g(@C12579k C21249u uVar);

    @C12579k
    @C20352p0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    /* renamed from: h */
    List<C21249u> mo63535h();

    @C12579k
    @C20352p0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    /* renamed from: i */
    List<String> mo63536i(@C12579k String str);

    @C20293d2
    @C12580l
    @C20352p0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id=:id")
    /* renamed from: j */
    C21249u.C21252c mo63537j(@C12579k String str);

    @C12580l
    @C20352p0("SELECT state FROM workspec WHERE id=:id")
    /* renamed from: k */
    WorkInfo.State mo63538k(@C12579k String str);

    @C12580l
    @C20352p0("SELECT * FROM workspec WHERE id=:id")
    /* renamed from: l */
    C21249u mo63539l(@C12579k String str);

    @C20352p0("UPDATE workspec SET last_enqueue_time=:enqueueTime WHERE id=:id")
    /* renamed from: m */
    void mo63540m(@C12579k String str, long j);

    @C12579k
    @C20352p0("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    /* renamed from: n */
    LiveData<Long> mo63541n(@C12579k String str);

    @C12579k
    @C20352p0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    /* renamed from: o */
    List<String> mo63542o(@C12579k String str);

    @C12579k
    @C20352p0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    /* renamed from: p */
    List<C21091d> mo63543p(@C12579k String str);

    @C20293d2
    @C20352p0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @C12579k
    /* renamed from: q */
    List<C21249u.C21252c> mo63544q(@C12579k String str);

    @C12579k
    @C20352p0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT :maxLimit")
    /* renamed from: r */
    List<C21249u> mo63545r(int i);

    @C20352p0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    /* renamed from: s */
    int mo63546s();

    @C20352p0("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    /* renamed from: t */
    int mo63547t(@C12579k String str, long j);

    @C12579k
    @C20352p0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    /* renamed from: u */
    List<C21249u.C21251b> mo63548u(@C12579k String str);

    @C12579k
    @C20352p0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    /* renamed from: v */
    List<C21249u> mo63549v(int i);

    @C20352p0("UPDATE workspec SET state=:state WHERE id=:id")
    /* renamed from: w */
    int mo63550w(@C12579k WorkInfo.State state, @C12579k String str);

    @C20352p0("UPDATE workspec SET output=:output WHERE id=:id")
    /* renamed from: x */
    void mo63551x(@C12579k String str, @C12579k C21091d dVar);

    @C20293d2
    @C20352p0("SELECT id FROM workspec")
    @C12579k
    /* renamed from: y */
    LiveData<List<String>> mo63552y();

    @C20293d2
    @C20352p0("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @C12579k
    /* renamed from: z */
    LiveData<List<C21249u.C21252c>> mo63553z(@C12579k String str);
}
