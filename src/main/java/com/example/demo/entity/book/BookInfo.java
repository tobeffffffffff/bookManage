package com.example.demo.entity.book;


import xyz.erupt.annotation.*;
import xyz.erupt.annotation.sub_erupt.*;
import xyz.erupt.annotation.sub_field.*;
import xyz.erupt.annotation.sub_field.sub_edit.*;
import xyz.erupt.upms.model.base.HyperModel;
import javax.persistence.*;
import java.util.Set;
import xyz.erupt.jpa.model.BaseModel;
import java.util.Date;


@Erupt(name = "书籍信息")
@Table(name = "book_info")
@Entity
public class BookInfo extends BaseModel {

    @EruptField(
            views = @View(
                    title = "名称", sortable = true
            ),
            edit = @Edit(
                    title = "名称",
                    type = EditType.INPUT, search = @Search, notNull = true,
                    inputType = @InputType
            )
    )
    private String book_name;

    @EruptField(
            views = @View(
                    title = "书籍标签",
                    column = "id"
            ),
            edit = @Edit(
                    title = "书籍标签",
                    type = EditType.REFERENCE_TABLE, search = @Search, notNull = true,
                    referenceTableType = @ReferenceTableType(id = "id", label = "bookTag")
            )
    )
    private @ManyToOne BookTag tag;

    @EruptField(
            views = @View(
                    title = "详细信息"
            ),
            edit = @Edit(
                    title = "详细信息",
                    type = EditType.INPUT, search = @Search,
                    inputType = @InputType
            )
    )
    private String book_info;

    @EruptField(
            views = @View(
                    title = "豆瓣评分", sortable = true
            ),
            edit = @Edit(
                    title = "豆瓣评分",
                    type = EditType.SLIDER, search = @Search,
                    sliderType = @SliderType(max = 10)
            )
    )
    private Integer book_rank;

    @EruptField(
            views = @View(
                    title = "评分人数", sortable = true
            ),
            edit = @Edit(
                    title = "评分人数",
                    type = EditType.INPUT, search = @Search,
                    inputType = @InputType
            )
    )
    private String book_rank_num;

    @EruptField(
            views = @View(
                    title = "简介"
            ),
            edit = @Edit(
                    title = "简介",
                    type = EditType.INPUT, search = @Search,
                    inputType = @InputType
            )
    )
    private String introduction;

    @EruptField(
            views = @View(
                    title = "图片地址"
            ),
            edit = @Edit(
                    title = "图片地址",
                    type = EditType.INPUT, search = @Search,
                    inputType = @InputType
            )
    )
    private String filename;

    @EruptField(
            views = @View(
                    title = "图书详细信息"
            ),
            edit = @Edit(
                    title = "图书详细信息",
                    type = EditType.INPUT, search = @Search,
                    inputType = @InputType
            )
    )
    private String book_detail;

}