package lt.vu.mybatis.model;

public class Note {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.NOTE.ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.NOTE.LABEL
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    private String label;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.NOTE.NOTE
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.NOTE.CATEGORY_ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    private Integer categoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.NOTE.ID
     *
     * @return the value of PUBLIC.NOTE.ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.NOTE.ID
     *
     * @param id the value for PUBLIC.NOTE.ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.NOTE.LABEL
     *
     * @return the value of PUBLIC.NOTE.LABEL
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.NOTE.LABEL
     *
     * @param label the value for PUBLIC.NOTE.LABEL
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.NOTE.NOTE
     *
     * @return the value of PUBLIC.NOTE.NOTE
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.NOTE.NOTE
     *
     * @param note the value for PUBLIC.NOTE.NOTE
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.NOTE.CATEGORY_ID
     *
     * @return the value of PUBLIC.NOTE.CATEGORY_ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.NOTE.CATEGORY_ID
     *
     * @param categoryId the value for PUBLIC.NOTE.CATEGORY_ID
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}