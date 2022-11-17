package bera31.Project.service;

import bera31.Project.domain.comment.Comment;
import bera31.Project.domain.dto.requestdto.CommentRequestDto;
import bera31.Project.repository.CommentRepository;
import bera31.Project.repository.MemberRepository;
import bera31.Project.repository.page.GroupBuyingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final MemberRepository memberRepository;
    private final GroupBuyingRepository groupBuyingRepository;

    public Long saveComment(CommentRequestDto commentRequestDto, Long contentsId){
        //멤버 찾기
        //Comment comment = new Comment(commentRequestDto, 멤버, groupBuyingRepository.findById(contentsId));
        //commentRepository.save(comment);
        return 1l;
    }

    public Long saveChildComment(CommentRequestDto commentRequestDto, Long commentId){
        //멤버찾기
        Comment parent = commentRepository.findById(commentId);
        //Comment comment = new Comment(commentRequestDto, 멤버, parent);
        //parent.addChild(comment);
        return 1l;
    }

}
