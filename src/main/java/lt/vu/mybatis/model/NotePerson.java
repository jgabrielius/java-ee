package lt.vu.mybatis.model;

public class NotePerson {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.NOTE_PERSON.NOTES_ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    private Integer notesId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.NOTE_PERSON.PEOPLE_ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    private Integer peopleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.NOTE_PERSON.NOTES_ID
     *
     * @return the value of PUBLIC.NOTE_PERSON.NOTES_ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public Integer getNotesId() {
        return notesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.NOTE_PERSON.NOTES_ID
     *
     * @param notesId the value for PUBLIC.NOTE_PERSON.NOTES_ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public void setNotesId(Integer notesId) {
        this.notesId = notesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.NOTE_PERSON.PEOPLE_ID
     *
     * @return the value of PUBLIC.NOTE_PERSON.PEOPLE_ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public Integer getPeopleId() {
        return peopleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.NOTE_PERSON.PEOPLE_ID
     *
     * @param peopleId the value for PUBLIC.NOTE_PERSON.PEOPLE_ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public void setPeopleId(Integer peopleId) {
        this.peopleId = peopleId;
    }
}