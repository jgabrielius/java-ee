package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Note;
import org.mybatis.cdi.Mapper;

@Mapper
public interface NoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.NOTE
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.NOTE
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    int insert(Note record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.NOTE
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    Note selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.NOTE
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    List<Note> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.NOTE
     *
     * @mbg.generated Sun May 02 15:31:25 EEST 2021
     */
    int updateByPrimaryKey(Note record);
}