import { useEffect, useState } from "react";
import Pagination from "./Pagination";
import Post from "./Post";

const PageResult = () => {
  const [posts, setPosts] = useState([]);
  const [loading, setLoading] = useState(false);
  const [currentPage, setCurrentPage] = useState(1);
  const [postsPerPge, SetPostsPerPage] = useState(10);

  useEffect(() => {
    const fetchPosts = async () => {
      setLoading(true);
      try {
        const response = await fetch("http://localhost:8282/employ/showEmploy");
        const data = await response.json();
        setPosts(data);
        setLoading(false)
      } catch (error) {
        console.log(error);
      }
    }
    fetchPosts();
  }, [])

  const indexOfLastPost = currentPage * postsPerPge;
  const indexOfFirstPost = indexOfLastPost - postsPerPge;
  const currentPosts = posts.slice(indexOfFirstPost, indexOfLastPost);

  const handlePagination = (pageNumber) => {
    setCurrentPage(pageNumber);
  }

  return (
    <div className='container'>
      <Post posts={currentPosts} loading={loading} />
      <Pagination length={posts.length} postsPerPage={postsPerPge} handlePagination={handlePagination} currentPage={currentPage} />
    </div>
  )
}

export default PageResult