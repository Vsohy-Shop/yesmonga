package androidx.work.impl;

import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.a0 */
public final class C21101a0 {
    @C12579k

    /* renamed from: a */
    public static final String f54462a = "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ";
    @C12579k

    /* renamed from: b */
    public static final String f54463b = "\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ";
    @C12579k

    /* renamed from: c */
    public static final String f54464c = "\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ";
    @C12579k

    /* renamed from: d */
    public static final String f54465d = "DROP TABLE IF EXISTS alarmInfo";
    @C12579k

    /* renamed from: e */
    public static final String f54466e = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";
    @C12579k

    /* renamed from: f */
    public static final String f54467f = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";
    @C12579k

    /* renamed from: g */
    public static final String f54468g = "\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ";
    @C12579k

    /* renamed from: h */
    public static final String f54469h = "\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ";
    @C12579k

    /* renamed from: i */
    public static final String f54470i = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";
    @C12579k

    /* renamed from: j */
    public static final String f54471j = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";
    @C12579k

    /* renamed from: k */
    public static final String f54472k = "UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ";
    @C12579k

    /* renamed from: l */
    public static final String f54473l = "UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL";
    @C12579k

    /* renamed from: m */
    public static final String f54474m = "UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0";
}
