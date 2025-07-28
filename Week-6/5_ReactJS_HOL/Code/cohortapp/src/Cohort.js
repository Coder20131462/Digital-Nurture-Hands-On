class Cohort {
    constructor(cohortCode,
        startDate,
        technology,
        trainerName,
        coachName,
        currentStatus) {
        this.cohortCode = cohortCode;
        this.coachName = coachName;
        this.trainerName = trainerName;
        this.technology = technology;
        this.startDate = startDate;
        this.currentStatus = currentStatus;
    }
}
const CohortsData = [
  new Cohort('INTADMDF11', '15-Mar-2022', 'Python FSD', 'Neha Sharma', 'Rakesh', 'Scheduled'),
  new Cohort('ADM21JF015', '01-Oct-2021', 'Java FSD', 'Arun Verma', 'Priya', 'Completed'),
  new Cohort('CDBJF21026', '30-Dec-2021', 'Java FSD', 'Sara Lee', 'Rakesh', 'Ongoing'),
  new Cohort('INTADMJF13', '18-Apr-2022', 'Java FSD', 'To Be Assigned', 'Anjali', 'Scheduled'),
  new Cohort('CDE22JF012', '02-Jan-2022', 'Java FSD', 'David Kim', 'Priya', 'Ongoing'),
  new Cohort('INTADMDF12', '15-Mar-2022', 'Cloud Computing', 'Ravi Ranjan', 'Rakesh', 'Scheduled'),
  new Cohort('ADM22DF002', '05-Oct-2021', '.NET FSD', 'Angela White', 'Anjali', 'Ongoing'),
];

export {Cohort, CohortsData};