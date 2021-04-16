package com.example.demo.entity.book;


import org.hibernate.annotations.GenericGenerator;
import xyz.erupt.annotation.*;
import xyz.erupt.annotation.sub_erupt.*;
import xyz.erupt.annotation.sub_field.*;
import xyz.erupt.annotation.sub_field.sub_edit.*;
import xyz.erupt.upms.model.base.HyperModel;
import javax.persistence.*;
import java.util.Set;
import xyz.erupt.jpa.model.BaseModel;
import java.util.Date;

@Erupt(name = "标签书籍")
@Table(name = "book_tag")
@Entity
public class BookTag extends BaseModel {


    @EruptField(
            views = @View(
                    title = "书籍标签", sortable = true
            ),
            edit = @Edit(
                    title = "书籍标签",
                    type = EditType.INPUT, search = @Search, notNull = true,
                    inputType = @InputType
            )
    )
    private String bookTag;

}