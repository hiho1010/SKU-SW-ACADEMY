package im.heeho.blog.service;

import im.heeho.blog.domain.Article;
import im.heeho.blog.dto.AddArticleRequest;
import im.heeho.blog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
