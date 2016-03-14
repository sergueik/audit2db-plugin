TODO: debug currently failing and set to ignore tests:


src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java:    @Ignore
@Test
public void retrievalByMatchingDateRangeShouldReturnNonEmptyList() {
--
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    public void retrievalByNonMatchingDurationRangeShouldReturnEmptyList() {
--
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    public void retrievalByMatchingDurationRangeShouldReturnNonEmptyList() {
--
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    public void retrievalForMasterByMatchingDateRangeShouldReturnNonEmptyList() {
--
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    public void retrievingAllProjectNamesShouldMatchDataset() {
--
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    public void retrievingMatchingProjectNameShouldReturnValidDataset() {
--
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java:    @Ignore  
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    public void retrievingMatchingProjectNamePatternShouldReturnValidDataset() {
--
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java:    @Ignore  
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    public void retrievalByBlankParamNameShouldReturnNonEmptyList() {
--
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/BuildDetailsHibernateRepositoryTests.java-    public void retrievalByMatchingParamsShouldReturnNonEmptyList() {
--
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenConfiguringPlugin.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenConfiguringPlugin.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenConfiguringPlugin.java-    public void testShouldSaveJdbcDatasourceDetails() {
--
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenConfiguringPlugin.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenConfiguringPlugin.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenConfiguringPlugin.java-    public void testSecurityMatrixShouldIncludeAuditReportsPermissions() {
--
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenRunningJobsByDateReport.java:    @Ignore  
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenRunningJobsByDateReport.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenRunningJobsByDateReport.java-    public void testShouldDisplaySomeRecordsForMatchingSelection() {
--
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenRunningJobsHistoryReport.java:  @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenRunningJobsHistoryReport.java-  @Test
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenRunningJobsHistoryReport.java-  public void testShouldDisplaySomeRecordsForMatchingSelection() {
--
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenTestingDataSource.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenTestingDataSource.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/integration/WhenTestingDataSource.java-    public void testInvalidJdbcDriverShouldFail() throws Exception {
--
src/test/java/org/jenkins/plugins/audit2db/test/JobHistoryReportTests.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/JobHistoryReportTests.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/JobHistoryReportTests.java-    public void matchingParametersShouldReturnNonEmptyResults() {
--
src/test/java/org/jenkins/plugins/audit2db/test/JobHistoryReportTests.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/JobHistoryReportTests.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/JobHistoryReportTests.java-    public void projectNameWithWildcardShouldReturnNonEmptyResults() {
--
src/test/java/org/jenkins/plugins/audit2db/test/JobsByParamReportTests.java:    @Ignore
src/test/java/org/jenkins/plugins/audit2db/test/JobsByParamReportTests.java-    @Test
src/test/java/org/jenkins/plugins/audit2db/test/JobsByParamReportTests.java-    public void matchingParametersShouldReturnNonEmptyResults() {
